public class cwx extends cyt implements czm {
   public static final dfq b = dfp.C;
   public static final dfq c = dfp.w;
   private static final int j = 8;
   public static final int d = 128;
   private static final int k = 200;

   public cwx(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.b).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dez a(clf $$0) {
      eac $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ead.c;
      return this.n().a(a, $$0.k()).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(b) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dez $$0, cpl $$1, gu $$2) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dez $$0, cpl $$1, gu $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      if ($$1.Y() && (long)$$1.z.a(200) <= $$1.V() % 200L && $$2.v() == $$1.a(dki.a.b, $$2.u(), $$2.w()) - 1) {
         ars.a($$0.c(a).o(), $$1, $$2, 0.125, iv.aN, bgb.a(1, 2));
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c) && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(cpl $$0, dez $$1, egz $$2, cce $$3) {
      if ($$0.Y() && $$3 instanceof ccq && ((ccq)$$3).D()) {
         gu $$4 = $$2.a();
         if ($$0.g($$4)) {
            bix $$5 = bim.ai.a($$0);
            if ($$5 != null) {
               $$5.d(ehd.c($$4.c()));
               bii $$6 = $$3.v();
               $$5.b($$6 instanceof akl ? (akl)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, aow.xU, aox.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, c, b);
   }

   @Override
   public boolean f_(dez $$0) {
      return true;
   }
}
