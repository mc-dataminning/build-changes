public class cyc extends ctf {
   public static final int a = 3;
   public static final dgl b = dgb.as;
   private static final eii[] c = new eii[]{
      csx.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   protected cyc(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return c[$$0.c(b)];
   }

   @Override
   protected boolean d(dfl $$0, cpd $$1, gw $$2) {
      return $$0.a(csy.dX);
   }

   @Override
   public boolean e_(dfl $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return new cjh(cjk.ru);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b);
   }
}
