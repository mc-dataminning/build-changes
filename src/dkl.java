import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkl extends dme {
   protected static final fal c = dij.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dwf d = dwe.w;

   protected dkl(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkl> a();

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c;
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dfi $$0, jh $$1, dvo $$2) {
      return $$2.a($$0, $$1, jm.b, dqk.c);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (!this.c((dfi)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dff)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fbn.b);
            }
         }
      }
   }

   @Override
   protected int b(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      if ($$0.a((dfi)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dsr $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jm $$7 : jm.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dff $$0, jh $$1, dvo $$2) {
      if (!this.c((dfi)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.R().b($$1, this)) {
            fbn $$5 = fbn.c;
            if (this.b((dek)$$0, $$1, $$2)) {
               $$5 = fbn.a;
            } else if ($$3) {
               $$5 = fbn.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean c(dfi $$0, jh $$1, dvo $$2) {
      return false;
   }

   protected boolean a(dff $$0, jh $$1, dvo $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dff $$0, jh $$1, dvo $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dvo $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dil.cw) ? $$6.c(dol.f) : 0);
      }
   }

   protected int a(dfx $$0, jh $$1, dvo $$2) {
      jm $$3 = $$2.c(aF);
      jm $$4 = $$3.h();
      jm $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dvo $$0) {
      return true;
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, bve $$3, cwf $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dff $$0, jh $$1, dvo $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3.g());
      esw $$5 = ess.a($$0, $$3.g(), jm.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dek $$0, jh $$1, dvo $$2) {
      return 15;
   }

   public static boolean n(dvo $$0) {
      return $$0.b() instanceof dkl;
   }

   public boolean b(dek $$0, jh $$1, dvo $$2) {
      jm $$3 = $$2.c(aF).g();
      dvo $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(dvo var1);
}
