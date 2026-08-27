public class czm extends csx implements czy {
   private static final int e = 1;
   private static final eii f;
   private static final eii g;
   private static final eii h = csx.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final eii i = eif.b().a(0.0, -1.0, 0.0);
   public static final int a = 7;
   public static final dgl b = dgb.aW;
   public static final dgc c = dgb.C;
   public static final dgc d = dgb.b;

   protected czm(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(d) ? g : f;
      } else {
         return eif.b();
      }
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2) {
      return eif.b();
   }

   @Override
   public boolean a(dfl $$0, clp $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public dfl a(clp $$0) {
      gw $$1 = $$0.a();
      cpx $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.n().a(c, Boolean.valueOf($$2.b_($$1).a() == eap.c)).a(b, Integer.valueOf($$3)).a(d, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      if (!$$3.w_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      int $$4 = a($$1, $$2);
      dfl $$5 = $$0.a(b, Integer.valueOf($$4)).a(d, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(b) == 7) {
         if ($$0.c(b) == 7) {
            byo.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      if ($$3.a(eif.b(), $$2, true) && !$$3.b()) {
         return f;
      } else {
         return $$0.c(b) != 0 && $$0.c(d) && $$3.a(i, $$2, true) ? h : eif.a();
      }
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(c) ? eap.c.a(false) : super.c_($$0);
   }

   private boolean a(cpd $$0, gw $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cpd $$0, gw $$1) {
      gw.a $$2 = $$1.j().c(hc.a);
      dfl $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(csy.nS)) {
         $$4 = $$3.c(b);
      } else if ($$3.d($$0, $$2, hc.b)) {
         return 0;
      }

      for (hc $$5 : hc.c.a) {
         dfl $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(csy.nS)) {
            $$4 = Math.min($$4, $$6.c(b) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      eii $$0 = csx.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      eii $$1 = csx.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      eii $$2 = csx.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      eii $$3 = csx.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      eii $$4 = csx.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      f = eif.a($$0, $$1, $$2, $$3, $$4);
      eii $$5 = csx.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      eii $$6 = csx.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      eii $$7 = csx.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      eii $$8 = csx.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      g = eif.a(czm.h, f, $$6, $$5, $$8, $$7);
   }
}
