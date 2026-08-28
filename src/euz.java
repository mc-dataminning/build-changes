import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class euz implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final Map<String, Optional<eul>> b = new HashMap<>();
   private final DataFixer c;
   private final jt.a d;
   private final Path e;
   private CompletableFuture<?> f = CompletableFuture.completedFuture(null);

   public euz(Path $$0, DataFixer $$1, jt.a $$2) {
      this.c = $$1;
      this.e = $$0;
      this.d = $$2;
   }

   private Path a(String $$0) {
      return this.e.resolve($$0 + ".dat");
   }

   public <T extends eul> T a(eul.a<T> $$0, String $$1) {
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
   public <T extends eul> T b(eul.a<T> $$0, String $$1) {
      Optional<eul> $$2 = this.b.get($$1);
      if ($$2 == null) {
         $$2 = Optional.ofNullable(this.a($$0.b(), $$0.c(), $$1));
         this.b.put($$1, $$2);
      }

      return (T)$$2.orElse(null);
   }

   @Nullable
   private <T extends eul> T a(BiFunction<tq, jt.a, T> $$0, ban $$1, String $$2) {
      try {
         Path $$3 = this.a($$2);
         if (Files.exists($$3)) {
            tq $$4 = this.a($$2, $$1, ab.b().d().c());
            return $$0.apply($$4.p("data"), this.d);
         }
      } catch (Exception var6) {
         a.error("Error loading saved data: {}", $$2, var6);
      }

      return null;
   }

   public void a(String $$0, eul $$1) {
      this.b.put($$0, Optional.of($$1));
      $$1.c();
   }

   public tq a(String $$0, ban $$1, int $$2) throws IOException {
      tq var8;
      try (
         InputStream $$3 = Files.newInputStream(this.a($$0));
         PushbackInputStream $$4 = new PushbackInputStream(new ayj($$3), 2);
      ) {
         tq $$5;
         if (this.a($$4)) {
            $$5 = ud.a($$4, tz.a());
         } else {
            try (DataInputStream $$6 = new DataInputStream($$4)) {
               $$5 = ud.a($$6);
            }
         }

         int $$9 = uf.b($$5, 1343);
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
      Map<Path, tq> $$0 = this.c();
      if ($$0.isEmpty()) {
         return CompletableFuture.completedFuture(null);
      } else {
         this.f = this.f
            .thenCompose(
               $$1 -> CompletableFuture.allOf(
                     $$0.entrySet().stream().map($$0xx -> a((Path)$$0xx.getKey(), (tq)$$0xx.getValue())).toArray(CompletableFuture[]::new)
                  )
            );
         return this.f;
      }
   }

   private Map<Path, tq> c() {
      Map<Path, tq> $$0 = new Object2ObjectArrayMap();
      this.b.forEach(($$1, $$2) -> $$2.filter(eul::d).ifPresent($$2x -> $$0.put(this.a($$1), $$2x.a(this.d))));
      return $$0;
   }

   private static CompletableFuture<Void> a(Path $$0, tq $$1) {
      return CompletableFuture.runAsync(() -> {
         try {
            ud.a($$1, $$0);
         } catch (IOException var3) {
            a.error("Could not save data to {}", $$0.getFileName(), var3);
         }
      }, af.h());
   }

   public void b() {
      this.a().join();
   }

   @Override
   public void close() {
      this.b();
   }
}
