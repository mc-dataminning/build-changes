import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class byi extends bwy<bvh> {
   private static final int c = 40;
   private int d;
   @Nullable
   private etl e;
   @Nullable
   private ji f;
   private float g;

   public byi() {
      this(150, 250);
   }

   public byi(int $$0, int $$1) {
      super(ImmutableMap.of(cej.E, cek.c, cej.t, cek.b, cej.m, cek.a), $$0, $$1);
   }

   protected boolean a(arc $$0, bvh $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bwh<?> $$2 = $$1.ec();
         cem $$3 = $$2.c(cej.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ad())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cej.m);
            if ($$4) {
               $$2.b(cej.E);
            }

            return false;
         }
      }
   }

   protected boolean a(arc $$0, bvh $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cem> $$3 = $$1.ec().c(cej.m);
         boolean $$4 = $$3.<Boolean>map(byi::a).orElse(false);
         cer $$5 = $$1.L();
         return !$$5.k() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arc $$0, bvh $$1, long $$2) {
      if ($$1.ec().a(cej.m) && !this.a($$1, $$1.ec().c(cej.m).get()) && $$1.L().q()) {
         this.d = $$0.H_().a(40);
      }

      $$1.L().m();
      $$1.ec().b(cej.m);
      $$1.ec().b(cej.t);
      this.e = null;
   }

   protected void c(arc $$0, bvh $$1, long $$2) {
      $$1.ec().a(cej.t, this.e);
      $$1.L().a(this.e, (double)this.g);
   }

   protected void d(arc $$0, bvh $$1, long $$2) {
      etl $$3 = $$1.L().i();
      bwh<?> $$4 = $$1.ec();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cej.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cem $$5 = $$4.c(cej.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ad())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bvh $$0, cem $$1, long $$2) {
      ji $$3 = $$1.a().b();
      this.e = $$0.L().a($$3, 0);
      this.g = $$1.b();
      bwh<?> $$4 = $$0.ec();
      if (this.a($$0, $$1)) {
         $$4.b(cej.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cej.E);
         } else if (!$$4.a(cej.E)) {
            $$4.a(cej.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         fay $$6 = cga.a((bvn)$$0, 10, 7, fay.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.L().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bvh $$0, cem $$1) {
      return $$1.a().b().k($$0.dw()) <= $$1.c();
   }

   private static boolean a(cem $$0) {
      return $$0.a() instanceof bxj $$2 ? $$2.c().Z_() : false;
   }
}
