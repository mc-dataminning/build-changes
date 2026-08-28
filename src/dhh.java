import com.mojang.serialization.MapCodec;

public abstract class dhh extends djb {
   protected static final ews c = dff.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dsy d = dsx.w;

   protected dhh(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhh> a();

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c;
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dcg $$0, ja $$1, dsh $$2) {
      return $$2.a($$0, $$1, jf.b, dng.c);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!this.c((dcg)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dcd)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), exu.b);
            }
         }
      }
   }

   @Override
   protected int b(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if ($$0.a((dcg)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dpn $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jf $$7 : jf.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dcd $$0, ja $$1, dsh $$2) {
      if (!this.c((dcg)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.P().b($$1, this)) {
            exu $$5 = exu.c;
            if (this.b((dbj)$$0, $$1, $$2)) {
               $$5 = exu.a;
            } else if ($$3) {
               $$5 = exu.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(dcg $$0, ja $$1, dsh $$2) {
      return false;
   }

   protected boolean a(dcd $$0, ja $$1, dsh $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dcd $$0, ja $$1, dsh $$2) {
      jf $$3 = $$2.c(aE);
      ja $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dsh $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dfh.cw) ? $$6.c(dlh.f) : 0);
      }
   }

   protected int a(dct $$0, ja $$1, dsh $$2) {
      jf $$3 = $$2.c(aE);
      jf $$4 = $$3.h();
      jf $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean e_(dsh $$0) {
      return true;
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsy $$3, cua $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dcd $$0, ja $$1, dsh $$2) {
      jf $$3 = $$2.c(aE);
      ja $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dbj $$0, ja $$1, dsh $$2) {
      return 15;
   }

   public static boolean m(dsh $$0) {
      return $$0.b() instanceof dhh;
   }

   public boolean b(dbj $$0, ja $$1, dsh $$2) {
      jf $$3 = $$2.c(aE).g();
      dsh $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dsh var1);
}
