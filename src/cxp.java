public class cxp extends css {
   public static final int a = 3;
   public static final dfy b = dfo.as;
   private static final ehy[] c = new ehy[]{
      csk.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   protected cxp(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return c[$$0.c(b)];
   }

   @Override
   protected boolean d(dey $$0, coq $$1, gv $$2) {
      return $$0.a(csl.dX);
   }

   @Override
   public boolean e_(dey $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return new ciw(ciz.ru);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b);
   }
}
