import com.mojang.serialization.MapCodec;

public abstract class dia extends dju {
   protected static final exv c = dfy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dtt d = dts.w;

   protected dia(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dia> a();

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return c;
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      jd $$3 = $$2.e();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dcz $$0, jd $$1, dtc $$2) {
      return $$2.a($$0, $$1, ji.b, doa.c);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (!this.c((dcz)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dcw)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eyx.b);
            }
         }
      }
   }

   @Override
   protected int b(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if ($$0.a((dcz)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dqh $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ji $$7 : ji.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dcw $$0, jd $$1, dtc $$2) {
      if (!this.c((dcz)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.P().b($$1, this)) {
            eyx $$5 = eyx.c;
            if (this.b((dcc)$$0, $$1, $$2)) {
               $$5 = eyx.a;
            } else if ($$3) {
               $$5 = eyx.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(dcz $$0, jd $$1, dtc $$2) {
      return false;
   }

   protected boolean a(dcw $$0, jd $$1, dtc $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dcw $$0, jd $$1, dtc $$2) {
      ji $$3 = $$2.c(aE);
      jd $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dtc $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dga.cw) ? $$6.c(dmb.f) : 0);
      }
   }

   protected int a(ddm $$0, jd $$1, dtc $$2) {
      ji $$3 = $$2.c(aE);
      ji $$4 = $$3.h();
      ji $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, btn $$3, cuq $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dcw $$0, jd $$1, dtc $$2) {
      ji $$3 = $$2.c(aE);
      jd $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dcc $$0, jd $$1, dtc $$2) {
      return 15;
   }

   public static boolean m(dtc $$0) {
      return $$0.b() instanceof dia;
   }

   public boolean b(dcc $$0, jd $$1, dtc $$2) {
      ji $$3 = $$2.c(aE).g();
      dtc $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dtc var1);
}
