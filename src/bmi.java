import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bmi extends bkz<bjk> {
   private static final int c = 40;
   private int d;
   @Nullable
   private ebd e;
   @Nullable
   private gw f;
   private float g;

   public bmi() {
      this(150, 250);
   }

   public bmi(int $$0, int $$1) {
      super(ImmutableMap.of(bsj.E, bsk.c, bsj.t, bsk.b, bsj.m, bsk.a), $$0, $$1);
   }

   protected boolean a(aks $$0, bjk $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bki<?> $$2 = $$1.dN();
         bsm $$3 = $$2.c(bsj.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.V())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bsj.m);
            if ($$4) {
               $$2.b(bsj.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aks $$0, bjk $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bsm> $$3 = $$1.dN().c(bsj.m);
         boolean $$4 = $$3.<Boolean>map(bmi::a).orElse(false);
         bsr $$5 = $$1.L();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aks $$0, bjk $$1, long $$2) {
      if ($$1.dN().a(bsj.m) && !this.a($$1, $$1.dN().c(bsj.m).get()) && $$1.L().r()) {
         this.d = $$0.D_().a(40);
      }

      $$1.L().n();
      $$1.dN().b(bsj.m);
      $$1.dN().b(bsj.t);
      this.e = null;
   }

   protected void c(aks $$0, bjk $$1, long $$2) {
      $$1.dN().a(bsj.t, this.e);
      $$1.L().a(this.e, (double)this.g);
   }

   protected void d(aks $$0, bjk $$1, long $$2) {
      ebd $$3 = $$1.L().j();
      bki<?> $$4 = $$1.dN();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bsj.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bsm $$5 = $$4.c(bsj.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.V())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bjk $$0, bsm $$1, long $$2) {
      gw $$3 = $$1.a().b();
      this.e = $$0.L().a($$3, 0);
      this.g = $$1.b();
      bki<?> $$4 = $$0.dN();
      if (this.a($$0, $$1)) {
         $$4.b(bsj.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bsj.E);
         } else if (!$$4.a(bsj.E)) {
            $$4.a(bsj.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ehp $$6 = bty.a((bjr)$$0, 10, 7, ehp.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.L().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bjk $$0, bsm $$1) {
      return $$1.a().b().k($$0.dl()) <= $$1.c();
   }

   private static boolean a(bsm $$0) {
      return $$0.a() instanceof blk $$2 ? $$2.c().M_() : false;
   }
}
