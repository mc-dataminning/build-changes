import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dyt implements AutoCloseable {
   public static final int d = 1493;
   private final dyv a;
   protected final DataFixer e;
   @Nullable
   private volatile elw b;

   public dyt(dzc $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new dyv($$0, $$1, $$3);
   }

   public boolean b(del $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public un a(alk<dff> $$0, Supplier<eto> $$1, un $$2, Optional<alk<MapCodec<? extends dxk>>> $$3) {
      int $$4 = a($$2);
      if ($$4 == ab.b().d().c()) {
         return $$2;
      } else {
         try {
            if ($$4 < 1493) {
               $$2 = bax.c.a(this.e, $$2, $$4, 1493);
               if ($$2.p("Level").q("hasLegacyStructureData")) {
                  elw $$5 = this.a($$0, $$1);
                  $$2 = $$5.a($$2);
               }
            }

            a($$2, $$0, $$3);
            $$2 = bax.c.a(this.e, $$2, Math.max(1493, $$4));
            b($$2);
            vc.e($$2);
            return $$2;
         } catch (Exception var9) {
            o $$7 = o.a(var9, "Updated chunk");
            p $$8 = $$7.a("Updated chunk details");
            $$8.a("Data version", $$4);
            throw new z($$7);
         }
      }
   }

   private elw a(alk<dff> $$0, Supplier<eto> $$1) {
      elw $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = elw.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(un $$0, alk<dff> $$1, Optional<alk<MapCodec<? extends dxk>>> $$2) {
      un $$3 = new un();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   private static void b(un $$0) {
      $$0.r("__context");
   }

   public static int a(un $$0) {
      return vc.b($$0, -1);
   }

   public CompletableFuture<Optional<un>> d(del $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(del $$0, Supplier<un> $$1) {
      this.e($$0);
      return this.a.a($$0, $$1);
   }

   protected void e(del $$0) {
      if (this.b != null) {
         this.b.a($$0.a());
      }
   }

   public void o() {
      this.a.a(true).join();
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public dys p() {
      return this.a;
   }

   protected dzc q() {
      return this.a.a();
   }
}
