public class cyz extends cst implements csn {
   public static final dfz d = dfp.aU;
   protected static final float e = 6.0F;
   protected static final ehw f = csl.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   private final def a;

   protected cyz(def $$0, dey.d $$1) {
      super($$1);
      this.a = $$0;
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return f;
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.z($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(akk $$0, gu $$1, dez $$2, aru $$3) {
      if ($$2.c(d) == 0) {
         $$0.a($$1, $$2.a(d), 4);
      } else {
         this.a.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return true;
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(d);
   }
}
