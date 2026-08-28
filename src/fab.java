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

public class fab implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final ezm.a b;
   private final Map<ezn<?>, Optional<ezm>> c = new HashMap<>();
   private final DataFixer d;
   private final ji.a e;
   private final Path f;
   private CompletableFuture<?> g = CompletableFuture.completedFuture(null);

   public fab(ezm.a $$0, Path $$1, DataFixer $$2, ji.a $$3) {
      this.b = $$0;
      this.d = $$2;
      this.f = $$1;
      this.e = $$3;
   }

   private Path a(String $$0) {
      return this.f.resolve($$0 + ".dat");
   }

   public <T extends ezm> T a(ezn<T> $$0) {
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
   public <T extends ezm> T b(ezn<T> $$0) {
      Optional<ezm> $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = Optional.ofNullable(this.c($$0));
         this.c.put($$0, $$1);
      }

      return (T)$$1.orElse(null);
   }

   @Nullable
   private <T extends ezm> T c(ezn<T> $$0) {
      try {
         Path $$1 = this.a($$0.a());
         if (Files.exists($$1)) {
            ua $$2 = this.a($$0.a(), $$0.d(), ac.b().d().c());
            alp<va> $$3 = this.e.a(uo.a);
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

   public <T extends ezm> void a(ezn<T> $$0, T $$1) {
      this.c.put($$0, Optional.of($$1));
      $$1.f();
   }

   public ua a(String $$0, bbo $$1, int $$2) throws IOException {
      ua var8;
      try (
         InputStream $$3 = Files.newInputStream(this.a($$0));
         PushbackInputStream $$4 = new PushbackInputStream(new azh($$3), 2);
      ) {
         ua $$5;
         if (this.a($$4)) {
            $$5 = un.a($$4, uj.a());
         } else {
            try (DataInputStream $$6 = new DataInputStream($$4)) {
               $$5 = un.a($$6);
            }
         }

         int $$9 = up.b($$5, 1343);
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
      Map<ezn<?>, ua> $$0 = this.c();
      if ($$0.isEmpty()) {
         return CompletableFuture.completedFuture(null);
      } else {
         int $$1 = ag.g();
         int $$2 = $$0.size();
         if ($$2 > $$1) {
            this.g = this.g.thenCompose($$3 -> {
               List<CompletableFuture<?>> $$4 = new ArrayList<>($$1);
               int $$5 = azz.e($$2, $$1);

               for (List<Entry<ezn<?>, ua>> $$6 : Iterables.partition($$0.entrySet(), $$5)) {
                  $$4.add(CompletableFuture.runAsync(() -> {
                     for (Entry<ezn<?>, ua> $$1xx : $$6) {
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
                           .map($$0xx -> CompletableFuture.runAsync(() -> this.a((ezn<?>)$$0xx.getKey(), (ua)$$0xx.getValue()), ag.i()))
                           .toArray(CompletableFuture[]::new)
                     )
               );
         }

         return this.g;
      }
   }

   private Map<ezn<?>, ua> c() {
      Map<ezn<?>, ua> $$0 = new Object2ObjectArrayMap();
      alp<va> $$1 = this.e.a(uo.a);
      this.c.forEach(($$2, $$3) -> $$3.filter(ezm::g).ifPresent($$3x -> {
            $$0.put($$2, this.a($$2, $$3x, $$1));
            $$3x.a(false);
         }));
      return $$0;
   }

   private <T extends ezm> ua a(ezn<T> $$0, ezm $$1, alp<va> $$2) {
      Codec<T> $$3 = $$0.c().apply(this.b);
      ua $$4 = new ua();
      $$4.a("data", (va)$$3.encodeStart($$2, $$1).getOrThrow());
      up.e($$4);
      return $$4;
   }

   private void a(ezn<?> $$0, ua $$1) {
      Path $$2 = this.a($$0.a());

      try {
         un.a($$1, $$2);
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
