import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dxu implements AutoCloseable {
   public static final int d = 1493;
   private final dxw a;
   protected final DataFixer e;
   @Nullable
   private volatile ekx b;

   public dxu(dyd $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new dxw($$0, $$1, $$3);
   }

   public boolean b(ddm $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public uf a(alb<deg> $$0, Supplier<esp> $$1, uf $$2, Optional<alb<MapCodec<? extends dwl>>> $$3) {
      int $$4 = a($$2);
      if ($$4 == ab.b().d().c()) {
         return $$2;
      } else {
         try {
            if ($$4 < 1493) {
               $$2 = bam.c.a(this.e, $$2, $$4, 1493);
               if ($$2.p("Level").q("hasLegacyStructureData")) {
                  ekx $$5 = this.a($$0, $$1);
                  $$2 = $$5.a($$2);
               }
            }

            a($$2, $$0, $$3);
            $$2 = bam.c.a(this.e, $$2, Math.max(1493, $$4));
            b($$2);
            uu.e($$2);
            return $$2;
         } catch (Exception var9) {
            o $$7 = o.a(var9, "Updated chunk");
            p $$8 = $$7.a("Updated chunk details");
            $$8.a("Data version", $$4);
            throw new z($$7);
         }
      }
   }

   private ekx a(alb<deg> $$0, Supplier<esp> $$1) {
      ekx $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = ekx.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(uf $$0, alb<deg> $$1, Optional<alb<MapCodec<? extends dwl>>> $$2) {
      uf $$3 = new uf();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   private static void b(uf $$0) {
      $$0.r("__context");
   }

   public static int a(uf $$0) {
      return uu.b($$0, -1);
   }

   public CompletableFuture<Optional<uf>> d(ddm $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(ddm $$0, Supplier<uf> $$1) {
      this.e($$0);
      return this.a.a($$0, $$1);
   }

   protected void e(ddm $$0) {
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

   public dxt p() {
      return this.a;
   }

   protected dyd q() {
      return this.a.a();
   }
}
