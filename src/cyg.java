public class cyg extends cuw {
   public static final dgc b = dgb.w;

   public cyg(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.d).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(b)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(cpy $$0, gw $$1) {
      if (!$$0.w_() && !$$0.L().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(cpx $$0, gw $$1, dfl $$2) {
      hc $$3 = $$2.c(a);
      gw $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }

   @Override
   public int b(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(b) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.w_() && $$0.c(b) && !$$1.L().a($$2, this)) {
            dfl $$5 = $$0.a(b, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(b) && $$1.L().a($$2, this)) {
            this.a($$1, $$2, $$0.a(b, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, $$0.d().g().g());
   }
}
