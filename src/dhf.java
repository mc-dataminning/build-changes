import com.mojang.serialization.MapCodec;

public abstract class dhf extends djc {
   protected static final exn c = dfc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dtt d = dts.w;

   protected dhf(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhf> a();

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c;
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dcd $$0, ir $$1, dtc $$2) {
      return $$2.a($$0, $$1, iw.b, dns.c);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (!this.c((dcd)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dca)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eyp.b);
            }
         }
      }
   }

   @Override
   protected int b(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if ($$0.a((dcd)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dqc $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (iw $$7 : iw.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dca $$0, ir $$1, dtc $$2) {
      if (!this.c((dcd)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.P().b($$1, this)) {
            eyp $$5 = eyp.c;
            if (this.b((dbg)$$0, $$1, $$2)) {
               $$5 = eyp.a;
            } else if ($$3) {
               $$5 = eyp.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(dcd $$0, ir $$1, dtc $$2) {
      return false;
   }

   protected boolean a(dca $$0, ir $$1, dtc $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dca $$0, ir $$1, dtc $$2) {
      iw $$3 = $$2.c(aE);
      ir $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dtc $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dfe.dh) ? $$6.c(dls.f) : 0);
      }
   }

   protected int a(dcq $$0, ir $$1, dtc $$2) {
      iw $$3 = $$2.c(aE);
      iw $$4 = $$3.h();
      iw $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, bso $$3, cuh $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dca $$0, ir $$1, dtc $$2) {
      iw $$3 = $$2.c(aE);
      ir $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dbg $$0, ir $$1, dtc $$2) {
      return 15;
   }

   public static boolean m(dtc $$0) {
      return $$0.b() instanceof dhf;
   }

   public boolean b(dbg $$0, ir $$1, dtc $$2) {
      iw $$3 = $$2.c(aE).g();
      dtc $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dtc var1);
}
