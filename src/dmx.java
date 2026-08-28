import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmx extends dot {
   public static final dzd c = dzc.A;
   private static final fdo a = dku.b(16.0, 0.0, 2.0);

   protected dmx(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmx> a();

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return a;
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.e();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(dhs $$0, jj $$1, dym $$2) {
      return $$2.a($$0, $$1, jo.b, dtb.c);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!this.b((dhs)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((dhp)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), feq.b);
            }
         }
      }
   }

   @Override
   protected int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(e) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if ($$0.a((dhs)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dvl $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jo $$7 : jo.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dhp $$0, jj $$1, dym $$2) {
      if (!this.b((dhs)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.U().b($$1, this)) {
            feq $$5 = feq.c;
            if (this.b((dgv)$$0, $$1, $$2)) {
               $$5 = feq.a;
            } else if ($$3) {
               $$5 = feq.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean b(dhs $$0, jj $$1, dym $$2) {
      return false;
   }

   protected boolean a(dhp $$0, jj $$1, dym $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dhp $$0, jj $$1, dym $$2) {
      jo $$3 = $$2.c(e);
      jj $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dym $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dkw.cE) ? $$6.c(drb.f) : 0);
      }
   }

   protected int a(dih $$0, jj $$1, dym $$2) {
      jo $$3 = $$2.c(e);
      jo $$4 = $$3.h();
      jo $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bwr $$3, cxy $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      if (!$$3) {
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dhp $$0, jj $$1, dym $$2) {
      jo $$3 = $$2.c(e);
      jj $$4 = $$1.a($$3.g());
      ewb $$5 = evx.a($$0, $$3.g(), jo.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dgv $$0, jj $$1, dym $$2) {
      return 15;
   }

   public static boolean n(dym $$0) {
      return $$0.b() instanceof dmx;
   }

   public boolean b(dgv $$0, jj $$1, dym $$2) {
      jo $$3 = $$2.c(e).g();
      dym $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(e) != $$3;
   }

   protected abstract int h(dym var1);
}
