public class cxr extends csu {
   public static final int a = 3;
   public static final dga b = dfq.as;
   private static final ehx[] c = new ehx[]{
      csm.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   protected cxr(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return c[$$0.c(b)];
   }

   @Override
   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      return $$0.a(csn.dX);
   }

   @Override
   public boolean e_(dfa $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return new ciy(cjb.ru);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b);
   }
}
