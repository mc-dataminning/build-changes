import com.google.common.collect.Iterables;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezp implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final eza.a b;
   private final Map<ezb<?>, Optional<eza>> c = new HashMap<>();
   private final DataFixer d;
   private final jh.a e;
   private final Path f;
   private CompletableFuture<?> g = CompletableFuture.completedFuture(null);

   public ezp(eza.a $$0, Path $$1, DataFixer $$2, jh.a $$3) {
      this.b = $$0;
      this.d = $$2;
      this.f = $$1;
      this.e = $$3;
   }

   private Path a(String $$0) {
      return this.f.resolve($$0 + ".dat");
   }

   public <T extends eza> T a(ezb<T> $$0) {
      T $$1 = this.b($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         T $$2 = (T)$$0.b().apply(this.b);
         this.a($$0, $$2);
         return $$2;
      }
   }

   @Nullable
   public <T extends eza> T b(ezb<T> $$0) {
      Optional<eza> $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = Optional.ofNullable(this.c($$0));
         this.c.put($$0, $$1);
      }

      return (T)$$1.orElse(null);
   }

   @Nullable
   private <T extends eza> T c(ezb<T> $$0) {
      try {
         Path $$1 = this.a($$0.a());
         if (Files.exists($$1)) {
            tz $$2 = this.a($$0.a(), $$0.d(), ac.b().d().c());
            alg<uy> $$3 = this.e.a(un.a);
            return (T)$$0.c()
               .apply(this.b)
               .parse($$3, $$2.a("data"))
               .resultOrPartial($$1x -> a.error("Failed to parse saved data for '{}': {}", $$0, $$1x))
               .orElse(null);
         }
      } catch (Exception var5) {
         a.error("Error loading saved data: {}", $$0, var5);
      }

      return null;
   }

   public <T extends eza> void a(ezb<T> $$0, T $$1) {
      this.c.put($$0, Optional.of($$1));
      $$1.f();
   }

   public tz a(String $$0, bbd $$1, int $$2) throws IOException {
      tz var8;
      try (
         InputStream $$3 = Files.newInputStream(this.a($$0));
         PushbackInputStream $$4 = new PushbackInputStream(new ayx($$3), 2);
      ) {
         tz $$5;
         if (this.a($$4)) {
            $$5 = um.a($$4, ui.a());
         } else {
            try (DataInputStream $$6 = new DataInputStream($$4)) {
               $$5 = um.a($$6);
            }
         }

         int $$9 = uo.b($$5, 1343);
         var8 = $$1.a(this.d, $$5, $$9, $$2);
      }

      return var8;
   }

   private boolean a(PushbackInputStream $$0) throws IOException {
      byte[] $$1 = new byte[2];
      boolean $$2 = false;
      int $$3 = $$0.read($$1, 0, 2);
      if ($$3 == 2) {
         int $$4 = ($$1[1] & 255) << 8 | $$1[0] & 255;
         if ($$4 == 35615) {
            $$2 = true;
         }
      }

      if ($$3 != 0) {
         $$0.unread($$1, 0, $$3);
      }

      return $$2;
   }

   public CompletableFuture<?> a() {
      Map<ezb<?>, tz> $$0 = this.c();
      if ($$0.isEmpty()) {
         return CompletableFuture.completedFuture(null);
      } else {
         int $$1 = ag.g();
         int $$2 = $$0.size();
         if ($$2 > $$1) {
            this.g = this.g.thenCompose($$3 -> {
               List<CompletableFuture<?>> $$4 = new ArrayList<>($$1);
               int $$5 = azo.e($$2, $$1);

               for (List<Entry<ezb<?>, tz>> $$6 : Iterables.partition($$0.entrySet(), $$5)) {
                  $$4.add(CompletableFuture.runAsync(() -> {
                     for (Entry<ezb<?>, tz> $$1xx : $$6) {
                        this.a($$1xx.getKey(), $$1xx.getValue());
                     }
                  }, ag.i()));
               }

               return CompletableFuture.allOf($$4.toArray(CompletableFuture[]::new));
            });
         } else {
            this.g = this.g
               .thenCompose(
                  $$1x -> CompletableFuture.allOf(
                        $$0.entrySet()
                           .stream()
                           .map($$0xx -> CompletableFuture.runAsync(() -> this.a((ezb<?>)$$0xx.getKey(), (tz)$$0xx.getValue()), ag.i()))
                           .toArray(CompletableFuture[]::new)
                     )
               );
         }

         return this.g;
      }
   }

   private Map<ezb<?>, tz> c() {
      Map<ezb<?>, tz> $$0 = new Object2ObjectArrayMap();
      alg<uy> $$1 = this.e.a(un.a);
      this.c.forEach(($$2, $$3) -> $$3.filter(eza::g).ifPresent($$3x -> {
            $$0.put($$2, this.a($$2, $$3x, $$1));
            $$3x.a(false);
         }));
      return $$0;
   }

   private <T extends eza> tz a(ezb<T> $$0, eza $$1, alg<uy> $$2) {
      Codec<T> $$3 = $$0.c().apply(this.b);
      tz $$4 = new tz();
      $$4.a("data", (uy)$$3.encodeStart($$2, $$1).getOrThrow());
      uo.e($$4);
      return $$4;
   }

   private void a(ezb<?> $$0, tz $$1) {
      Path $$2 = this.a($$0.a());

      try {
         um.a($$1, $$2);
      } catch (IOException var5) {
         a.error("Could not save data to {}", $$2.getFileName(), var5);
      }
   }

   public void b() {
      this.a().join();
   }

   @Override
   public void close() {
      this.b();
   }
}
