import com.mojang.serialization.MapCodec;

public abstract class dhk extends dje {
   protected static final exa c = dfi.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dtc d = dtb.w;

   protected dhk(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhk> a();

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return c;
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      ja $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dcj $$0, ja $$1, dsl $$2) {
      return $$2.a($$0, $$1, jf.b, dnj.c);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!this.c((dcj)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dcg)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eyc.b);
            }
         }
      }
   }

   @Override
   protected int b(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      if ($$0.a((dcj)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dpq $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jf $$7 : jf.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dcg $$0, ja $$1, dsl $$2) {
      if (!this.c((dcj)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.P().b($$1, this)) {
            eyc $$5 = eyc.c;
            if (this.b((dbm)$$0, $$1, $$2)) {
               $$5 = eyc.a;
            } else if ($$3) {
               $$5 = eyc.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(dcj $$0, ja $$1, dsl $$2) {
      return false;
   }

   protected boolean a(dcg $$0, ja $$1, dsl $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dcg $$0, ja $$1, dsl $$2) {
      jf $$3 = $$2.c(aE);
      ja $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dsl $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dfk.cw) ? $$6.c(dlk.f) : 0);
      }
   }

   protected int a(dcw $$0, ja $$1, dsl $$2) {
      jf $$3 = $$2.c(aE);
      jf $$4 = $$3.h();
      jf $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean e_(dsl $$0) {
      return true;
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, btc $$3, cud $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dcg $$0, ja $$1, dsl $$2) {
      jf $$3 = $$2.c(aE);
      ja $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dbm $$0, ja $$1, dsl $$2) {
      return 15;
   }

   public static boolean m(dsl $$0) {
      return $$0.b() instanceof dhk;
   }

   public boolean b(dbm $$0, ja $$1, dsl $$2) {
      jf $$3 = $$2.c(aE).g();
      dsl $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dsl var1);
}
