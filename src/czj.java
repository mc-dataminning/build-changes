public class czj extends ctd implements csx {
   public static final dgj d = dfz.aU;
   protected static final float e = 6.0F;
   protected static final eig f = csv.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   private final dep a;

   protected czj(dep $$0, dfi.d $$1) {
      super($$1);
      this.a = $$0;
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return f;
   }

   @Override
   public void b(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if ($$1.z($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(akr $$0, gw $$1, dfj $$2, asc $$3) {
      if ($$2.c(d) == 0) {
         $$0.a($$1, $$2.a(d), 4);
      } else {
         this.a.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      return true;
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(akr $$0, asc $$1, gw $$2, dfj $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(d);
   }
}
