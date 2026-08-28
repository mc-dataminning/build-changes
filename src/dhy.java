import com.mojang.serialization.MapCodec;

public abstract class dhy extends djs {
   protected static final exp c = dfw.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dtr d = dtq.w;

   protected dhy(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhy> a();

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return c;
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dcx $$0, jd $$1, dta $$2) {
      return $$2.a($$0, $$1, ji.b, dny.c);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (!this.c((dcx)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dcu)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eyr.b);
            }
         }
      }
   }

   @Override
   protected int b(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      if ($$0.a((dcx)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dqf $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ji $$7 : ji.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dcu $$0, jd $$1, dta $$2) {
      if (!this.c((dcx)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.P().b($$1, this)) {
            eyr $$5 = eyr.c;
            if (this.b((dca)$$0, $$1, $$2)) {
               $$5 = eyr.a;
            } else if ($$3) {
               $$5 = eyr.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(dcx $$0, jd $$1, dta $$2) {
      return false;
   }

   protected boolean a(dcu $$0, jd $$1, dta $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dcu $$0, jd $$1, dta $$2) {
      ji $$3 = $$2.c(aE);
      jd $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dta $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dfy.cw) ? $$6.c(dlz.f) : 0);
      }
   }

   protected int a(ddk $$0, jd $$1, dta $$2) {
      ji $$3 = $$2.c(aE);
      ji $$4 = $$3.h();
      ji $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean e_(dta $$0) {
      return true;
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, btl $$3, cuo $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dcu $$0, jd $$1, dta $$2) {
      ji $$3 = $$2.c(aE);
      jd $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dca $$0, jd $$1, dta $$2) {
      return 15;
   }

   public static boolean m(dta $$0) {
      return $$0.b() instanceof dhy;
   }

   public boolean b(dca $$0, jd $$1, dta $$2) {
      ji $$3 = $$2.c(aE).g();
      dta $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dta var1);
}
