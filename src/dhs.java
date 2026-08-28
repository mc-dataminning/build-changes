import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhs extends die {
   protected static final fah a = die.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final fah b = die.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ezi c = new ezi(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dvy d;

   protected dhs(dvi.d $$0, dvy $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dhs> a();

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dvj $$0) {
      return true;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1 == jm.a && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jh $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jm.b);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bue $$0, dfb $$1, jh $$2, dvj $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dvj $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awm.e);
         $$1.a($$0, eag.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awm.e);
         $$1.a($$0, eag.a, $$2);
      }

      if ($$7) {
         $$1.a(new jh($$2), this, this.b());
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dfb $$0, jh $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dvj $$0) {
      return true;
   }

   protected static int a(dfb $$0, ezi $$1, Class<? extends bue> $$2) {
      return $$0.a($$2, $$1, buj.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dfb var1, jh var2);

   protected abstract int h(dvj var1);

   protected abstract dvj a(dvj var1, int var2);
}
