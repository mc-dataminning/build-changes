public abstract class cuj extends cwe {
   protected static final ehw b = csl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dfq c = dfp.w;

   protected cuj(dey.d $$0) {
      super($$0);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return b;
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return c($$1, $$2.d());
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!this.a((cpo)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((cpl)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eit.b);
            }
         }
      }
   }

   @Override
   public int b(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(aC) == $$3 ? this.b($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      if ($$0.a((cpo)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dcl $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ha $$7 : ha.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cpl $$0, gu $$1, dez $$2) {
      if (!this.a((cpo)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.L().b($$1, this)) {
            eit $$5 = eit.c;
            if (this.c((cor)$$0, $$1, $$2)) {
               $$5 = eit.a;
            } else if ($$3) {
               $$5 = eit.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return false;
   }

   protected boolean a(cpl $$0, gu $$1, dez $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cpl $$0, gu $$1, dez $$2) {
      ha $$3 = $$2.c(aC);
      gu $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dez $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(csm.cw) ? $$6.c(cym.e) : 0);
      }
   }

   protected int a(cqb $$0, gu $$1, dez $$2) {
      ha $$3 = $$2.c(aC);
      ha $$4 = $$3.h();
      ha $$5 = $$3.i();
      boolean $$6 = this.a();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(dez $$0) {
      return true;
   }

   @Override
   public dez a(clf $$0) {
      return this.n().a(aC, $$0.g().g());
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cpl $$0, gu $$1, dez $$2) {
      ha $$3 = $$2.c(aC);
      gu $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean a() {
      return false;
   }

   protected int b(cor $$0, gu $$1, dez $$2) {
      return 15;
   }

   public static boolean h(dez $$0) {
      return $$0.b() instanceof cuj;
   }

   public boolean c(cor $$0, gu $$1, dez $$2) {
      ha $$3 = $$2.c(aC).g();
      dez $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aC) != $$3;
   }

   protected abstract int g(dez var1);
}
