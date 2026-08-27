public abstract class cuv extends cwq {
   protected static final eii b = csx.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dgc c = dgb.w;

   protected cuv(dfk.d $$0) {
      super($$0);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return b;
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.d();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(cqa $$0, gw $$1, dfl $$2) {
      return $$2.a($$0, $$1, hc.b, daz.c);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (!this.b((cqa)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((cpx)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), ejf.b);
            }
         }
      }
   }

   @Override
   public int b(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(aC) == $$3 ? this.b($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if ($$0.a((cqa)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dcx $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (hc $$7 : hc.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cpx $$0, gw $$1, dfl $$2) {
      if (!this.b((cqa)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.L().b($$1, this)) {
            ejf $$5 = ejf.c;
            if (this.c((cpd)$$0, $$1, $$2)) {
               $$5 = ejf.a;
            } else if ($$3) {
               $$5 = ejf.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean b(cqa $$0, gw $$1, dfl $$2) {
      return false;
   }

   protected boolean a(cpx $$0, gw $$1, dfl $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cpx $$0, gw $$1, dfl $$2) {
      hc $$3 = $$2.c(aC);
      gw $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dfl $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(csy.cw) ? $$6.c(cyy.e) : 0);
      }
   }

   protected int a(cqn $$0, gw $$1, dfl $$2) {
      hc $$3 = $$2.c(aC);
      hc $$4 = $$3.h();
      hc $$5 = $$3.i();
      boolean $$6 = this.a();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(aC, $$0.g().g());
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cpx $$0, gw $$1, dfl $$2) {
      hc $$3 = $$2.c(aC);
      gw $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean a() {
      return false;
   }

   protected int b(cpd $$0, gw $$1, dfl $$2) {
      return 15;
   }

   public static boolean h(dfl $$0) {
      return $$0.b() instanceof cuv;
   }

   public boolean c(cpd $$0, gw $$1, dfl $$2) {
      hc $$3 = $$2.c(aC).g();
      dfl $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aC) != $$3;
   }

   protected abstract int g(dfl var1);
}
