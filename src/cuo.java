public abstract class cuo extends cwj {
   protected static final eib b = csq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dfv c = dfu.w;

   protected cuo(dfd.d $$0) {
      super($$0);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return b;
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.d();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(cpt $$0, gw $$1, dfe $$2) {
      return $$2.a($$0, $$1, hc.b, das.c);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (!this.b((cpt)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((cpq)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eiy.b);
            }
         }
      }
   }

   @Override
   public int b(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(aC) == $$3 ? this.b($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if ($$0.a((cpt)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dcq $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (hc $$7 : hc.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cpq $$0, gw $$1, dfe $$2) {
      if (!this.b((cpt)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.L().b($$1, this)) {
            eiy $$5 = eiy.c;
            if (this.c((cow)$$0, $$1, $$2)) {
               $$5 = eiy.a;
            } else if ($$3) {
               $$5 = eiy.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean b(cpt $$0, gw $$1, dfe $$2) {
      return false;
   }

   protected boolean a(cpq $$0, gw $$1, dfe $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cpq $$0, gw $$1, dfe $$2) {
      hc $$3 = $$2.c(aC);
      gw $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dfe $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(csr.cw) ? $$6.c(cyr.e) : 0);
      }
   }

   protected int a(cqg $$0, gw $$1, dfe $$2) {
      hc $$3 = $$2.c(aC);
      hc $$4 = $$3.h();
      hc $$5 = $$3.i();
      boolean $$6 = this.a();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(dfe $$0) {
      return true;
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(aC, $$0.g().g());
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cpq $$0, gw $$1, dfe $$2) {
      hc $$3 = $$2.c(aC);
      gw $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean a() {
      return false;
   }

   protected int b(cow $$0, gw $$1, dfe $$2) {
      return 15;
   }

   public static boolean h(dfe $$0) {
      return $$0.b() instanceof cuo;
   }

   public boolean c(cow $$0, gw $$1, dfe $$2) {
      hc $$3 = $$2.c(aC).g();
      dfe $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aC) != $$3;
   }

   protected abstract int g(dfe var1);
}
