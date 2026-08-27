public abstract class cui extends cwd {
   protected static final ehy b = csk.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dfp c = dfo.w;

   protected cui(dex.d $$0) {
      super($$0);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b;
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return c($$1, $$2.d());
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!this.a((cpn)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((cpk)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eiv.b);
            }
         }
      }
   }

   @Override
   public int b(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(aC) == $$3 ? this.b($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      if ($$0.a((cpn)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dck $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (hb $$7 : hb.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cpk $$0, gv $$1, dey $$2) {
      if (!this.a((cpn)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.L().b($$1, this)) {
            eiv $$5 = eiv.c;
            if (this.c((coq)$$0, $$1, $$2)) {
               $$5 = eiv.a;
            } else if ($$3) {
               $$5 = eiv.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return false;
   }

   protected boolean a(cpk $$0, gv $$1, dey $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cpk $$0, gv $$1, dey $$2) {
      hb $$3 = $$2.c(aC);
      gv $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dey $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(csl.cw) ? $$6.c(cyl.e) : 0);
      }
   }

   protected int a(cqa $$0, gv $$1, dey $$2) {
      hb $$3 = $$2.c(aC);
      hb $$4 = $$3.h();
      hb $$5 = $$3.i();
      boolean $$6 = this.a();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }

   @Override
   public dey a(cle $$0) {
      return this.n().a(aC, $$0.g().g());
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cpk $$0, gv $$1, dey $$2) {
      hb $$3 = $$2.c(aC);
      gv $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean a() {
      return false;
   }

   protected int b(coq $$0, gv $$1, dey $$2) {
      return 15;
   }

   public static boolean h(dey $$0) {
      return $$0.b() instanceof cui;
   }

   public boolean c(coq $$0, gv $$1, dey $$2) {
      hb $$3 = $$2.c(aC).g();
      dey $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aC) != $$3;
   }

   protected abstract int g(dey var1);
}
