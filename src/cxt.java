public class cxt extends cuj {
   public static final dfp b = dfo.w;

   public cxt(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.d).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(b)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(cpl $$0, gv $$1) {
      if (!$$0.r_() && !$$0.L().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(cpk $$0, gv $$1, dey $$2) {
      hb $$3 = $$2.c(a);
      gv $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }

   @Override
   public int b(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(b) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.r_() && $$0.c(b) && !$$1.L().a($$2, this)) {
            dey $$5 = $$0.a(b, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(b) && $$1.L().a($$2, this)) {
            this.a($$1, $$2, $$0.a(b, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dey a(cle $$0) {
      return this.n().a(a, $$0.d().g().g());
   }
}
