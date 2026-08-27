public class ctx extends csd {
   public static final dcs a = dcr.w;
   protected static final int b = 6;
   protected static final int c = 6;
   protected static final int d = 8;
   protected static final efb e = cpn.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final efb f = cpn.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final efb g = cpn.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final efb h = cpn.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final efb i = cpn.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final efb j = cpn.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final efb k = cpn.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final efb l = cpn.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   protected ctx(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, ha.c).a(a, Boolean.valueOf(false)).a(I, dcm.b));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      switch ((dcm)$$0.c(I)) {
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
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.B) {
         dcb $$6 = $$0.a(a);
         if ($$6.c(a)) {
            a($$6, $$1, $$2, 1.0F);
         }

         return bdx.a;
      } else {
         dcb $$7 = this.d($$0, $$1, $$2);
         float $$8 = $$7.c(a) ? 0.6F : 0.5F;
         $$1.a(null, $$2, amh.ms, ami.e, 0.3F, $$8);
         $$1.a($$3, $$7.c(a) ? dgl.a : dgl.e, $$2);
         return bdx.b;
      }
   }

   public dcb d(dcb $$0, cmm $$1, gu $$2) {
      $$0 = $$0.a(a);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dcb $$0, cmn $$1, gu $$2, float $$3) {
      ha $$4 = $$0.c(aC).g();
      ha $$5 = h($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new ip(ip.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      if ($$0.c(a) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dcb $$0) {
      return true;
   }

   private void e(dcb $$0, cmm $$1, gu $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(I, aC, a);
   }
}
