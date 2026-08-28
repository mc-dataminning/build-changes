import com.mojang.serialization.MapCodec;

public abstract class dgz extends dit {
   protected static final ewi c = dex.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dsr d = dsq.w;

   protected dgz(drz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgz> a();

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return c;
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      iz $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dbz $$0, iz $$1, dsa $$2) {
      return $$2.a($$0, $$1, je.b, dmy.c);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!this.c((dbz)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dbw)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), exk.b);
            }
         }
      }
   }

   @Override
   protected int b(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      if ($$0.a((dbz)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dpf $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (je $$7 : je.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dbw $$0, iz $$1, dsa $$2) {
      if (!this.c((dbz)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.P().b($$1, this)) {
            exk $$5 = exk.c;
            if (this.b((dbc)$$0, $$1, $$2)) {
               $$5 = exk.a;
            } else if ($$3) {
               $$5 = exk.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(dbz $$0, iz $$1, dsa $$2) {
      return false;
   }

   protected boolean a(dbw $$0, iz $$1, dsa $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dbw $$0, iz $$1, dsa $$2) {
      je $$3 = $$2.c(aE);
      iz $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dsa $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dez.cw) ? $$6.c(dkz.f) : 0);
      }
   }

   protected int a(dcm $$0, iz $$1, dsa $$2) {
      je $$3 = $$2.c(aE);
      je $$4 = $$3.h();
      je $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean e_(dsa $$0) {
      return true;
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, btn $$3, cun $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dbw $$0, iz $$1, dsa $$2) {
      je $$3 = $$2.c(aE);
      iz $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dbc $$0, iz $$1, dsa $$2) {
      return 15;
   }

   public static boolean m(dsa $$0) {
      return $$0.b() instanceof dgz;
   }

   public boolean b(dbc $$0, iz $$1, dsa $$2) {
      je $$3 = $$2.c(aE).g();
      dsa $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dsa var1);
}
