public class cvy extends cws {
   public static final int a = 3;
   public static final dgl b = dgb.as;
   private static final int c = 4;
   private static final int d = 2;

   public cvy(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.z($$2) > 11 - $$0.c(b) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         gw.a $$4 = new gw.a();

         for (hc $$5 : hc.values()) {
            $$4.a($$2, $$5);
            dfl $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, ary.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, ary.a($$3, 20, 40));
      }
   }

   private boolean e(dfl $$0, cpx $$1, gw $$2) {
      int $$3 = $$0.c(b);
      if ($$3 < 3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3 + 1)), 2);
         return false;
      } else {
         this.d($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if ($$3.n().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cpd $$0, gw $$1, int $$2) {
      int $$3 = 0;
      gw.a $$4 = new gw.a();

      for (hc $$5 : hc.values()) {
         $$4.a($$1, $$5);
         if ($$0.a_($$4).a(this)) {
            if (++$$3 >= $$2) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b);
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return cjh.b;
   }
}
