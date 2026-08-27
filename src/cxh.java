public class cxh extends cvn {
   public static final dgc a = dgb.w;
   protected static final int b = 6;
   protected static final int c = 6;
   protected static final int d = 8;
   protected static final eii e = csx.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final eii f = csx.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final eii g = csx.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final eii h = csx.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final eii i = csx.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final eii j = csx.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final eii k = csx.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final eii l = csx.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   protected cxh(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, hc.c).a(a, Boolean.valueOf(false)).a(I, dfw.b));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      switch ((dfw)$$0.c(I)) {
         case a:
            switch ($$0.c(aC).o()) {
               case a:
                  return j;
               case c:
               default:
                  return i;
            }
         case b:
            switch ((hc)$$0.c(aC)) {
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
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         dfl $$6 = $$0.a(a);
         if ($$6.c(a)) {
            a($$6, $$1, $$2, 1.0F);
         }

         return bha.a;
      } else {
         dfl $$7 = this.d($$0, $$1, $$2);
         float $$8 = $$7.c(a) ? 0.6F : 0.5F;
         $$1.a(null, $$2, apf.ms, apg.e, 0.3F, $$8);
         $$1.a($$3, $$7.c(a) ? djv.a : djv.e, $$2);
         return bha.b;
      }
   }

   public dfl d(dfl $$0, cpx $$1, gw $$2) {
      $$0 = $$0.a(a);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dfl $$0, cpy $$1, gw $$2, float $$3) {
      hc $$4 = $$0.c(aC).g();
      hc $$5 = h($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new ir(ir.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$0.c(a) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }

   private void e(dfl $$0, cpx $$1, gw $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(I, aC, a);
   }
}
