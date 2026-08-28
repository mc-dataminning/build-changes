import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class byl extends bxb<bvk> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eto e;
   @Nullable
   private ji f;
   private float g;

   public byl() {
      this(150, 250);
   }

   public byl(int $$0, int $$1) {
      super(ImmutableMap.of(cem.E, cen.c, cem.t, cen.b, cem.m, cen.a), $$0, $$1);
   }

   protected boolean a(ard $$0, bvk $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bwk<?> $$2 = $$1.eb();
         cep $$3 = $$2.c(cem.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ad())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cem.m);
            if ($$4) {
               $$2.b(cem.E);
            }

            return false;
         }
      }
   }

   protected boolean a(ard $$0, bvk $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cep> $$3 = $$1.eb().c(cem.m);
         boolean $$4 = $$3.<Boolean>map(byl::a).orElse(false);
         ceu $$5 = $$1.P();
         return !$$5.k() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(ard $$0, bvk $$1, long $$2) {
      if ($$1.eb().a(cem.m) && !this.a($$1, $$1.eb().c(cem.m).get()) && $$1.P().q()) {
         this.d = $$0.H_().a(40);
      }

      $$1.P().m();
      $$1.eb().b(cem.m);
      $$1.eb().b(cem.t);
      this.e = null;
   }

   protected void c(ard $$0, bvk $$1, long $$2) {
      $$1.eb().a(cem.t, this.e);
      $$1.P().a(this.e, (double)this.g);
   }

   protected void d(ard $$0, bvk $$1, long $$2) {
      eto $$3 = $$1.P().i();
      bwk<?> $$4 = $$1.eb();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cem.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cep $$5 = $$4.c(cem.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ad())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bvk $$0, cep $$1, long $$2) {
      ji $$3 = $$1.a().b();
      this.e = $$0.P().a($$3, 0);
      this.g = $$1.b();
      bwk<?> $$4 = $$0.eb();
      if (this.a($$0, $$1)) {
         $$4.b(cem.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cem.E);
         } else if (!$$4.a(cem.E)) {
            $$4.a(cem.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         fbb $$6 = cgd.a((bvq)$$0, 10, 7, fbb.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.P().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bvk $$0, cep $$1) {
      return $$1.a().b().k($$0.dv()) <= $$1.c();
   }

   private static boolean a(cep $$0) {
      return $$0.a() instanceof bxm $$2 ? $$2.c().Z_() : false;
   }
}
