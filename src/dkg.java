import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkg extends dlz {
   protected static final fah c = die.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dwa d = dvz.w;

   protected dkg(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkg> a();

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c;
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dfe $$0, jh $$1, dvj $$2) {
      return $$2.a($$0, $$1, jm.b, dqf.c);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!this.c((dfe)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dfb)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fbj.b);
            }
         }
      }
   }

   @Override
   protected int b(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if ($$0.a((dfe)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dsm $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jm $$7 : jm.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dfb $$0, jh $$1, dvj $$2) {
      if (!this.c((dfe)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.R().b($$1, this)) {
            fbj $$5 = fbj.c;
            if (this.b((deg)$$0, $$1, $$2)) {
               $$5 = fbj.a;
            } else if ($$3) {
               $$5 = fbj.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean c(dfe $$0, jh $$1, dvj $$2) {
      return false;
   }

   protected boolean a(dfb $$0, jh $$1, dvj $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dfb $$0, jh $$1, dvj $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dvj $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dig.cw) ? $$6.c(dog.f) : 0);
      }
   }

   protected int a(dfs $$0, jh $$1, dvj $$2) {
      jm $$3 = $$2.c(aF);
      jm $$4 = $$3.h();
      jm $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dvj $$0) {
      return true;
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bva $$3, cwb $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dfb $$0, jh $$1, dvj $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3.g());
      ess $$5 = eso.a($$0, $$3.g(), jm.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(deg $$0, jh $$1, dvj $$2) {
      return 15;
   }

   public static boolean n(dvj $$0) {
      return $$0.b() instanceof dkg;
   }

   public boolean b(deg $$0, jh $$1, dvj $$2) {
      jm $$3 = $$2.c(aF).g();
      dvj $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(dvj var1);
}
