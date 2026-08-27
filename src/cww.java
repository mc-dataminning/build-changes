public class cww extends cvc {
   public static final dfr a = dfq.w;
   protected static final int b = 6;
   protected static final int c = 6;
   protected static final int d = 8;
   protected static final ehx e = csm.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final ehx f = csm.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final ehx g = csm.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final ehx h = csm.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final ehx i = csm.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final ehx j = csm.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final ehx k = csm.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final ehx l = csm.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   protected cww(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, ha.c).a(a, Boolean.valueOf(false)).a(I, dfl.b));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      switch ((dfl)$$0.c(I)) {
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
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         dfa $$6 = $$0.a(a);
         if ($$6.c(a)) {
            a($$6, $$1, $$2, 1.0F);
         }

         return bgq.a;
      } else {
         dfa $$7 = this.d($$0, $$1, $$2);
         float $$8 = $$7.c(a) ? 0.6F : 0.5F;
         $$1.a(null, $$2, aow.ms, aox.e, 0.3F, $$8);
         $$1.a($$3, $$7.c(a) ? djk.a : djk.e, $$2);
         return bgq.b;
      }
   }

   public dfa d(dfa $$0, cpm $$1, gu $$2) {
      $$0 = $$0.a(a);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dfa $$0, cpn $$1, gu $$2, float $$3) {
      ha $$4 = $$0.c(aC).g();
      ha $$5 = h($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new ip(ip.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if ($$0.c(a) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dfa $$0) {
      return true;
   }

   private void e(dfa $$0, cpm $$1, gu $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(I, aC, a);
   }
}
