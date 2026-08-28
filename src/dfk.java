import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dfk extends dfw {
   protected static final exp a = dfw.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final exp b = dfw.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ewr c = new ewr(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dtp d;

   protected dfk(dsz.d $$0, dtp $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dfk> a();

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dta $$0) {
      return true;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ji.b);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bsq $$0, dcu $$1, jd $$2, dta $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dta $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), avp.e);
         $$1.a($$0, dxw.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), avp.e);
         $$1.a($$0, dxw.a, $$2);
      }

      if ($$7) {
         $$1.a(new jd($$2), this, this.b());
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dcu $$0, jd $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$3 == ji.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(dta $$0) {
      return true;
   }

   protected static int a(dcu $$0, ewr $$1, Class<? extends bsq> $$2) {
      return $$0.a($$2, $$1, bsv.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dcu var1, jd var2);

   protected abstract int g(dta var1);

   protected abstract dta a(dta var1, int var2);
}
