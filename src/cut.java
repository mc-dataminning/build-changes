public abstract class cut extends cwo {
   protected static final eig b = csv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dga c = dfz.w;

   protected cut(dfi.d $$0) {
      super($$0);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return b;
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      gw $$3 = $$2.d();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(cpy $$0, gw $$1, dfj $$2) {
      return $$2.a($$0, $$1, ha.b, dax.c);
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if (!this.b((cpy)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((cpv)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), ejd.b);
            }
         }
      }
   }

   @Override
   public int b(dfj $$0, cpb $$1, gw $$2, ha $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dfj $$0, cpb $$1, gw $$2, ha $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(aC) == $$3 ? this.b($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      if ($$0.a((cpy)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dcv $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ha $$7 : ha.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cpv $$0, gw $$1, dfj $$2) {
      if (!this.b((cpy)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.L().b($$1, this)) {
            ejd $$5 = ejd.c;
            if (this.c((cpb)$$0, $$1, $$2)) {
               $$5 = ejd.a;
            } else if ($$3) {
               $$5 = ejd.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean b(cpy $$0, gw $$1, dfj $$2) {
      return false;
   }

   protected boolean a(cpv $$0, gw $$1, dfj $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cpv $$0, gw $$1, dfj $$2) {
      ha $$3 = $$2.c(aC);
      gw $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dfj $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(csw.cw) ? $$6.c(cyw.e) : 0);
      }
   }

   protected int a(cql $$0, gw $$1, dfj $$2) {
      ha $$3 = $$2.c(aC);
      ha $$4 = $$3.h();
      ha $$5 = $$3.i();
      boolean $$6 = this.a();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(dfj $$0) {
      return true;
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(aC, $$0.g().g());
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cpv $$0, gw $$1, dfj $$2) {
      ha $$3 = $$2.c(aC);
      gw $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean a() {
      return false;
   }

   protected int b(cpb $$0, gw $$1, dfj $$2) {
      return 15;
   }

   public static boolean h(dfj $$0) {
      return $$0.b() instanceof cut;
   }

   public boolean c(cpb $$0, gw $$1, dfj $$2) {
      ha $$3 = $$2.c(aC).g();
      dfj $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aC) != $$3;
   }

   protected abstract int g(dfj var1);
}
