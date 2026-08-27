public class cya extends ctd {
   public static final int a = 3;
   public static final dgj b = dfz.as;
   private static final eig[] c = new eig[]{
      csv.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   protected cya(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return c[$$0.c(b)];
   }

   @Override
   protected boolean d(dfj $$0, cpb $$1, gw $$2) {
      return $$0.a(csw.dX);
   }

   @Override
   public boolean e_(dfj $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(dfj $$0, akr $$1, gw $$2, asc $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return new cjf(cji.ru);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b);
   }
}
