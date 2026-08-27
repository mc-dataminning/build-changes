public class cww extends cys implements czl {
   public static final dfp b = dfo.C;
   public static final dfp c = dfo.w;
   private static final int j = 8;
   public static final int d = 128;
   private static final int k = 200;

   public cww(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.b).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dey a(cle $$0) {
      eab $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eac.c;
      return this.n().a(a, $$0.k()).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(b) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dey $$0, cpk $$1, gv $$2) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dey $$0, cpk $$1, gv $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$1.Y() && (long)$$1.z.a(200) <= $$1.V() % 200L && $$2.v() == $$1.a(dkh.a.b, $$2.u(), $$2.w()) - 1) {
         arr.a($$0.c(a).o(), $$1, $$2, 0.125, iw.aN, bfz.a(1, 2));
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c) && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(cpk $$0, dey $$1, ehb $$2, ccd $$3) {
      if ($$0.Y() && $$3 instanceof ccp && ((ccp)$$3).D()) {
         gv $$4 = $$2.a();
         if ($$0.g($$4)) {
            biv $$5 = bik.ai.a($$0);
            if ($$5 != null) {
               $$5.d(ehf.c($$4.c()));
               big $$6 = $$3.v();
               $$5.b($$6 instanceof akj ? (akj)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, aou.xP, aov.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, c, b);
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }
}
