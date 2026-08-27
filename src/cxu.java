public class cxu extends cuk {
   public static final dfq b = dfp.w;

   public cxu(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.d).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(b)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(cpm $$0, gu $$1) {
      if (!$$0.r_() && !$$0.L().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(cpl $$0, gu $$1, dez $$2) {
      ha $$3 = $$2.c(a);
      gu $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   public boolean f_(dez $$0) {
      return true;
   }

   @Override
   public int b(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.c(b) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.r_() && $$0.c(b) && !$$1.L().a($$2, this)) {
            dez $$5 = $$0.a(b, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(b) && $$1.L().a($$2, this)) {
            this.a($$1, $$2, $$0.a(b, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dez a(clf $$0) {
      return this.n().a(a, $$0.d().g().g());
   }
}
