import com.mojang.serialization.MapCodec;

public class czr extends cxz {
   public static final MapCodec<czr> a = b(czr::new);
   public static final die b = did.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final eks f = cvf.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final eks g = cvf.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final eks h = cvf.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final eks i = cvf.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final eks j = cvf.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final eks k = cvf.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final eks l = cvf.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final eks m = cvf.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<czr> a() {
      return a;
   }

   protected czr(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ib.c).a(b, Boolean.valueOf(false)).a(K, dhy.b));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      switch ((dhy)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((ib)$$0.c(aE)) {
               case f:
                  return i;
               case e:
                  return h;
               case d:
                  return g;
               case c:
               default:
                  return f;
            }
         case c:
         default:
            switch ($$0.c(aE).o()) {
               case a:
                  return m;
               case c:
               default:
                  return l;
            }
      }
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         dhn $$6 = $$0.a(b);
         if ($$6.c(b)) {
            a($$6, $$1, $$2, 1.0F);
         }

         return bjb.a;
      } else {
         dhn $$7 = this.d($$0, $$1, $$2);
         float $$8 = $$7.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, aqv.mM, aqw.e, 0.3F, $$8);
         $$1.a($$3, $$7.c(b) ? dlx.a : dlx.e, $$2);
         return bjb.b;
      }
   }

   public dhn d(dhn $$0, csf $$1, hx $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dhn $$0, csg $$1, hx $$2, float $$3) {
      ib $$4 = $$0.c(aE).g();
      ib $$5 = h($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new jq(jq.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   private void e(dhn $$0, csf $$1, hx $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(K, aE, b);
   }
}
