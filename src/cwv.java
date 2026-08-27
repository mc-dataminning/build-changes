public class cwv extends cvb {
   public static final dfq a = dfp.w;
   protected static final int b = 6;
   protected static final int c = 6;
   protected static final int d = 8;
   protected static final ehw e = csl.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final ehw f = csl.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final ehw g = csl.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final ehw h = csl.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final ehw i = csl.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final ehw j = csl.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final ehw k = csl.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final ehw l = csl.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   protected cwv(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, ha.c).a(a, Boolean.valueOf(false)).a(I, dfk.b));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      switch ((dfk)$$0.c(I)) {
         case a:
            switch ($$0.c(aC).o()) {
               case a:
                  return j;
               case c:
               default:
                  return i;
            }
         case b:
            switch ((ha)$$0.c(aC)) {
               case f:
                  return h;
               case e:
                  return g;
               case d:
                  return f;
               case c:
               default:
                  return e;
            }
         case c:
         default:
            switch ($$0.c(aC).o()) {
               case a:
                  return l;
               case c:
               default:
                  return k;
            }
      }
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         dez $$6 = $$0.a(a);
         if ($$6.c(a)) {
            a($$6, $$1, $$2, 1.0F);
         }

         return bgq.a;
      } else {
         dez $$7 = this.d($$0, $$1, $$2);
         float $$8 = $$7.c(a) ? 0.6F : 0.5F;
         $$1.a(null, $$2, aow.ms, aox.e, 0.3F, $$8);
         $$1.a($$3, $$7.c(a) ? djj.a : djj.e, $$2);
         return bgq.b;
      }
   }

   public dez d(dez $$0, cpl $$1, gu $$2) {
      $$0 = $$0.a(a);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dez $$0, cpm $$1, gu $$2, float $$3) {
      ha $$4 = $$0.c(aC).g();
      ha $$5 = h($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new ip(ip.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      if ($$0.c(a) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dez $$0) {
      return true;
   }

   private void e(dez $$0, cpl $$1, gu $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(I, aC, a);
   }
}
