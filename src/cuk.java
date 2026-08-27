public abstract class cuk extends cwf {
   protected static final ehx b = csm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dfr c = dfq.w;

   protected cuk(dez.d $$0) {
      super($$0);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return b;
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return c($$1, $$2.d());
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (!this.a((cpp)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((cpm)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eiu.b);
            }
         }
      }
   }

   @Override
   public int b(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dfa $$0, cos $$1, gu $$2, ha $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(aC) == $$3 ? this.b($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      if ($$0.a((cpp)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dcm $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ha $$7 : ha.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cpm $$0, gu $$1, dfa $$2) {
      if (!this.a((cpp)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.L().b($$1, this)) {
            eiu $$5 = eiu.c;
            if (this.c((cos)$$0, $$1, $$2)) {
               $$5 = eiu.a;
            } else if ($$3) {
               $$5 = eiu.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return false;
   }

   protected boolean a(cpm $$0, gu $$1, dfa $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cpm $$0, gu $$1, dfa $$2) {
      ha $$3 = $$2.c(aC);
      gu $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dfa $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(csn.cw) ? $$6.c(cyn.e) : 0);
      }
   }

   protected int a(cqc $$0, gu $$1, dfa $$2) {
      ha $$3 = $$2.c(aC);
      ha $$4 = $$3.h();
      ha $$5 = $$3.i();
      boolean $$6 = this.a();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(dfa $$0) {
      return true;
   }

   @Override
   public dfa a(clg $$0) {
      return this.n().a(aC, $$0.g().g());
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cpm $$0, gu $$1, dfa $$2) {
      ha $$3 = $$2.c(aC);
      gu $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean a() {
      return false;
   }

   protected int b(cos $$0, gu $$1, dfa $$2) {
      return 15;
   }

   public static boolean h(dfa $$0) {
      return $$0.b() instanceof cuk;
   }

   public boolean c(cos $$0, gu $$1, dfa $$2) {
      ha $$3 = $$2.c(aC).g();
      dfa $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aC) != $$3;
   }

   protected abstract int g(dfa var1);
}
