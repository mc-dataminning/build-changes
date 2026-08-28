import com.google.common.collect.Iterables;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
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
import java.util.function.BiFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewt implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final Map<String, Optional<ewf>> b = new HashMap<>();
   private final DataFixer c;
   private final ju.a d;
   private final Path e;
   private CompletableFuture<?> f = CompletableFuture.completedFuture(null);

   public ewt(Path $$0, DataFixer $$1, ju.a $$2) {
      this.c = $$1;
      this.e = $$0;
      this.d = $$2;
   }

   private Path a(String $$0) {
      return this.e.resolve($$0 + ".dat");
   }

   public <T extends ewf> T a(ewf.a<T> $$0, String $$1) {
      T $$2 = this.b($$0, $$1);
      if ($$2 != null) {
         return $$2;
      } else {
         T $$3 = (T)$$0.a().get();
         this.a($$1, $$3);
         return $$3;
      }
   }

   @Nullable
   public <T extends ewf> T b(ewf.a<T> $$0, String $$1) {
      Optional<ewf> $$2 = this.b.get($$1);
      if ($$2 == null) {
         $$2 = Optional.ofNullable(this.a($$0.b(), $$0.c(), $$1));
         this.b.put($$1, $$2);
      }

      return (T)$$2.orElse(null);
   }

   @Nullable
   private <T extends ewf> T a(BiFunction<tw, ju.a, T> $$0, bax $$1, String $$2) {
      try {
         Path $$3 = this.a($$2);
         if (Files.exists($$3)) {
            tw $$4 = this.a($$2, $$1, ab.b().d().c());
            return $$0.apply($$4.p("data"), this.d);
         }
      } catch (Exception var6) {
         a.error("Error loading saved data: {}", $$2, var6);
      }

      return null;
   }

   public void a(String $$0, ewf $$1) {
      this.b.put($$0, Optional.of($$1));
      $$1.g();
   }

   public tw a(String $$0, bax $$1, int $$2) throws IOException {
      tw var8;
      try (
         InputStream $$3 = Files.newInputStream(this.a($$0));
         PushbackInputStream $$4 = new PushbackInputStream(new ayt($$3), 2);
      ) {
         tw $$5;
         if (this.a($$4)) {
            $$5 = uj.a($$4, uf.a());
         } else {
            try (DataInputStream $$6 = new DataInputStream($$4)) {
               $$5 = uj.a($$6);
            }
         }

         int $$9 = ul.b($$5, 1343);
         var8 = $$1.a(this.c, $$5, $$9, $$2);
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
      Map<Path, tw> $$0 = this.c();
      if ($$0.isEmpty()) {
         return CompletableFuture.completedFuture(null);
      } else {
         int $$1 = af.g();
         int $$2 = $$0.size();
         if ($$2 > $$1) {
            this.f = this.f.thenCompose($$3 -> {
               List<CompletableFuture<?>> $$4 = new ArrayList<>($$1);
               int $$5 = azk.e($$2, $$1);

               for (List<Entry<Path, tw>> $$6 : Iterables.partition($$0.entrySet(), $$5)) {
                  $$4.add(CompletableFuture.runAsync(() -> {
                     for (Entry<Path, tw> $$1xx : $$6) {
                        a($$1xx.getKey(), $$1xx.getValue());
                     }
                  }, af.i()));
               }

               return CompletableFuture.allOf($$4.toArray(CompletableFuture[]::new));
            });
         } else {
            this.f = this.f
               .thenCompose(
                  $$1x -> CompletableFuture.allOf(
                        $$0.entrySet()
                           .stream()
                           .map($$0xx -> CompletableFuture.runAsync(() -> a((Path)$$0xx.getKey(), (tw)$$0xx.getValue()), af.i()))
                           .toArray(CompletableFuture[]::new)
                     )
               );
         }

         return this.f;
      }
   }

   private Map<Path, tw> c() {
      Map<Path, tw> $$0 = new Object2ObjectArrayMap();
      this.b.forEach(($$1, $$2) -> $$2.filter(ewf::h).ifPresent($$2x -> $$0.put(this.a($$1), $$2x.a(this.d))));
      return $$0;
   }

   private static void a(Path $$0, tw $$1) {
      try {
         uj.a($$1, $$0);
      } catch (IOException var3) {
         a.error("Could not save data to {}", $$0.getFileName(), var3);
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
