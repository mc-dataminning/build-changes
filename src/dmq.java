import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmq extends dok {
   protected static final fcs c = dkm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dym d = dyl.x;

   protected dmq(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmq> a();

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c;
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dhl $$0, jh $$1, dxv $$2) {
      return $$2.a($$0, $$1, jm.b, dsq.c);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!this.c((dhl)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dhi)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fdu.b);
            }
         }
      }
   }

   @Override
   protected int b(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      if ($$0.a((dhl)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dux $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jm $$7 : jm.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dhi $$0, jh $$1, dxv $$2) {
      if (!this.c((dhl)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.T().b($$1, this)) {
            fdu $$5 = fdu.c;
            if (this.b((dgn)$$0, $$1, $$2)) {
               $$5 = fdu.a;
            } else if ($$3) {
               $$5 = fdu.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean c(dhl $$0, jh $$1, dxv $$2) {
      return false;
   }

   protected boolean a(dhi $$0, jh $$1, dxv $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dhi $$0, jh $$1, dxv $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dxv $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dko.cE) ? $$6.c(dqr.f) : 0);
      }
   }

   protected int a(dia $$0, jh $$1, dxv $$2) {
      jm $$3 = $$2.c(aF);
      jm $$4 = $$3.h();
      jm $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dxv $$0) {
      return true;
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bwg $$3, cxp $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dhi $$0, jh $$1, dxv $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3.g());
      evf $$5 = evb.a($$0, $$3.g(), jm.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dgn $$0, jh $$1, dxv $$2) {
      return 15;
   }

   public static boolean n(dxv $$0) {
      return $$0.b() instanceof dmq;
   }

   public boolean b(dgn $$0, jh $$1, dxv $$2) {
      jm $$3 = $$2.c(aF).g();
      dxv $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(dxv var1);
}
