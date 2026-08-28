import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmp extends doj {
   protected static final fcr c = dkl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dyl d = dyk.x;

   protected dmp(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmp> a();

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return c;
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dhk $$0, jh $$1, dxu $$2) {
      return $$2.a($$0, $$1, jm.b, dsp.c);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (!this.c((dhk)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dhh)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fdt.b);
            }
         }
      }
   }

   @Override
   protected int b(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      if ($$0.a((dhk)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         duw $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jm $$7 : jm.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dhh $$0, jh $$1, dxu $$2) {
      if (!this.c((dhk)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.T().b($$1, this)) {
            fdt $$5 = fdt.c;
            if (this.b((dgm)$$0, $$1, $$2)) {
               $$5 = fdt.a;
            } else if ($$3) {
               $$5 = fdt.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean c(dhk $$0, jh $$1, dxu $$2) {
      return false;
   }

   protected boolean a(dhh $$0, jh $$1, dxu $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dhh $$0, jh $$1, dxu $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dxu $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dkn.cE) ? $$6.c(dqq.f) : 0);
      }
   }

   protected int a(dhz $$0, jh $$1, dxu $$2) {
      jm $$3 = $$2.c(aF);
      jm $$4 = $$3.h();
      jm $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dxu $$0) {
      return true;
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, bwf $$3, cxo $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dhh $$0, jh $$1, dxu $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3.g());
      eve $$5 = eva.a($$0, $$3.g(), jm.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dgm $$0, jh $$1, dxu $$2) {
      return 15;
   }

   public static boolean n(dxu $$0) {
      return $$0.b() instanceof dmp;
   }

   public boolean b(dgm $$0, jh $$1, dxu $$2) {
      jm $$3 = $$2.c(aF).g();
      dxu $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(dxu var1);
}
