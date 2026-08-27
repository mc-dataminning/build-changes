public class cwu extends cva {
   public static final dfp a = dfo.w;
   protected static final int b = 6;
   protected static final int c = 6;
   protected static final int d = 8;
   protected static final ehy e = csk.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final ehy f = csk.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final ehy g = csk.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final ehy h = csk.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final ehy i = csk.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final ehy j = csk.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final ehy k = csk.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final ehy l = csk.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   protected cwu(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, hb.c).a(a, Boolean.valueOf(false)).a(I, dfj.b));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      switch ((dfj)$$0.c(I)) {
         case a:
            switch ($$0.c(aC).o()) {
               case a:
                  return j;
               case c:
               default:
                  return i;
            }
         case b:
            switch ((hb)$$0.c(aC)) {
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
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         dey $$6 = $$0.a(a);
         if ($$6.c(a)) {
            a($$6, $$1, $$2, 1.0F);
         }

         return bgo.a;
      } else {
         dey $$7 = this.d($$0, $$1, $$2);
         float $$8 = $$7.c(a) ? 0.6F : 0.5F;
         $$1.a(null, $$2, aou.ms, aov.e, 0.3F, $$8);
         $$1.a($$3, $$7.c(a) ? dji.a : dji.e, $$2);
         return bgo.b;
      }
   }

   public dey d(dey $$0, cpk $$1, gv $$2) {
      $$0 = $$0.a(a);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dey $$0, cpl $$1, gv $$2, float $$3) {
      hb $$4 = $$0.c(aC).g();
      hb $$5 = h($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new iq(iq.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$0.c(a) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }

   private void e(dey $$0, cpk $$1, gv $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(I, aC, a);
   }
}
