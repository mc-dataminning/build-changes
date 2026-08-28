import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eaz implements AutoCloseable {
   public static final int d = 1493;
   private final ebb a;
   protected final DataFixer e;
   @Nullable
   private volatile eoe b;

   public eaz(ebi $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new ebb($$0, $$1, $$3);
   }

   public boolean b(dgn $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public ux a(aly<dhh> $$0, Supplier<evw> $$1, ux $$2, Optional<aly<MapCodec<? extends dzq>>> $$3) {
      int $$4 = a($$2);
      if ($$4 == ab.b().d().c()) {
         return $$2;
      } else {
         try {
            if ($$4 < 1493) {
               $$2 = bbs.c.a(this.e, $$2, $$4, 1493);
               if ($$2.p("Level").q("hasLegacyStructureData")) {
                  eoe $$5 = this.a($$0, $$1);
                  $$2 = $$5.a($$2);
               }
            }

            a($$2, $$0, $$3);
            $$2 = bbs.c.a(this.e, $$2, Math.max(1493, $$4));
            b($$2);
            vm.e($$2);
            return $$2;
         } catch (Exception var9) {
            o $$7 = o.a(var9, "Updated chunk");
            p $$8 = $$7.a("Updated chunk details");
            $$8.a("Data version", $$4);
            throw new z($$7);
         }
      }
   }

   private eoe a(aly<dhh> $$0, Supplier<evw> $$1) {
      eoe $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = eoe.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(ux $$0, aly<dhh> $$1, Optional<aly<MapCodec<? extends dzq>>> $$2) {
      ux $$3 = new ux();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   private static void b(ux $$0) {
      $$0.r("__context");
   }

   public static int a(ux $$0) {
      return vm.b($$0, -1);
   }

   public CompletableFuture<Optional<ux>> d(dgn $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dgn $$0, Supplier<ux> $$1) {
      this.e($$0);
      return this.a.a($$0, $$1);
   }

   protected void e(dgn $$0) {
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

   public eay p() {
      return this.a;
   }

   protected ebi q() {
      return this.a.a();
   }
}
