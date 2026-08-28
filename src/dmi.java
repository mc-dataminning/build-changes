import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmi extends doc {
   protected static final fcm c = dke.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dye d = dyd.x;

   protected dmi(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmi> a();

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return c;
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dhd $$0, jh $$1, dxn $$2) {
      return $$2.a($$0, $$1, jm.b, dsi.c);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (!this.c((dhd)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dha)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fdo.b);
            }
         }
      }
   }

   @Override
   protected int b(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if ($$0.a((dhd)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dup $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jm $$7 : jm.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dha $$0, jh $$1, dxn $$2) {
      if (!this.c((dhd)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.T().b($$1, this)) {
            fdo $$5 = fdo.c;
            if (this.b((dgf)$$0, $$1, $$2)) {
               $$5 = fdo.a;
            } else if ($$3) {
               $$5 = fdo.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean c(dhd $$0, jh $$1, dxn $$2) {
      return false;
   }

   protected boolean a(dha $$0, jh $$1, dxn $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dha $$0, jh $$1, dxn $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dxn $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dkg.cE) ? $$6.c(dqj.f) : 0);
      }
   }

   protected int a(dhs $$0, jh $$1, dxn $$2) {
      jm $$3 = $$2.c(aF);
      jm $$4 = $$3.h();
      jm $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dxn $$0) {
      return true;
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, bwb $$3, cxk $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dha $$0, jh $$1, dxn $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3.g());
      eux $$5 = eut.a($$0, $$3.g(), jm.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dgf $$0, jh $$1, dxn $$2) {
      return 15;
   }

   public static boolean n(dxn $$0) {
      return $$0.b() instanceof dmi;
   }

   public boolean b(dgf $$0, jh $$1, dxn $$2) {
      jm $$3 = $$2.c(aF).g();
      dxn $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(dxn var1);
}
