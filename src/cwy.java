public class cwy extends cyu implements czn {
   public static final dfr b = dfq.C;
   public static final dfr c = dfq.w;
   private static final int j = 8;
   public static final int d = 128;
   private static final int k = 200;

   public cwy(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.b).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dfa a(clg $$0) {
      ead $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eae.c;
      return this.n().a(a, $$0.k()).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(b) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dfa $$0, cpm $$1, gu $$2) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dfa $$0, cpm $$1, gu $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if ($$1.Y() && (long)$$1.z.a(200) <= $$1.V() % 200L && $$2.v() == $$1.a(dkj.a.b, $$2.u(), $$2.w()) - 1) {
         ars.a($$0.c(a).o(), $$1, $$2, 0.125, iv.aN, bgb.a(1, 2));
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c) && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(cpm $$0, dfa $$1, eha $$2, ccf $$3) {
      if ($$0.Y() && $$3 instanceof ccr && ((ccr)$$3).D()) {
         gu $$4 = $$2.a();
         if ($$0.g($$4)) {
            bix $$5 = bim.ai.a($$0);
            if ($$5 != null) {
               $$5.d(ehe.c($$4.c()));
               bii $$6 = $$3.v();
               $$5.b($$6 instanceof akl ? (akl)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, aow.xP, aox.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, c, b);
   }

   @Override
   public boolean f_(dfa $$0) {
      return true;
   }
}
