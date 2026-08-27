public class cxz extends cup {
   public static final dfv b = dfu.w;

   public cxz(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.d).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(b)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(cpr $$0, gw $$1) {
      if (!$$0.r_() && !$$0.L().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(cpq $$0, gw $$1, dfe $$2) {
      hc $$3 = $$2.c(a);
      gw $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   public boolean f_(dfe $$0) {
      return true;
   }

   @Override
   public int b(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.c(b) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.r_() && $$0.c(b) && !$$1.L().a($$2, this)) {
            dfe $$5 = $$0.a(b, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(b) && $$1.L().a($$2, this)) {
            this.a($$1, $$2, $$0.a(b, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, $$0.d().g().g());
   }
}
