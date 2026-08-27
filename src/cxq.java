public class cxq extends cst {
   public static final int a = 3;
   public static final dfz b = dfp.as;
   private static final ehw[] c = new ehw[]{
      csl.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   protected cxq(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return c[$$0.c(b)];
   }

   @Override
   protected boolean d(dez $$0, cor $$1, gu $$2) {
      return $$0.a(csm.dX);
   }

   @Override
   public boolean e_(dez $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return new cix(cja.ru);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(b);
   }
}
