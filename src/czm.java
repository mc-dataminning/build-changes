import com.mojang.serialization.MapCodec;

public class czm extends cxu {
   public static final MapCodec<czm> a = b(czm::new);
   public static final dhz b = dhy.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final ekn f = cva.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final ekn g = cva.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final ekn h = cva.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final ekn i = cva.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final ekn j = cva.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final ekn k = cva.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final ekn l = cva.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final ekn m = cva.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<czm> a() {
      return a;
   }

   protected czm(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, hx.c).a(b, Boolean.valueOf(false)).a(K, dht.b));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      switch ((dht)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((hx)$$0.c(aE)) {
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
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         dhi $$6 = $$0.a(b);
         if ($$6.c(b)) {
            a($$6, $$1, $$2, 1.0F);
         }

         return bix.a;
      } else {
         dhi $$7 = this.d($$0, $$1, $$2);
         float $$8 = $$7.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, aqr.mM, aqs.e, 0.3F, $$8);
         $$1.a($$3, $$7.c(b) ? dls.a : dls.e, $$2);
         return bix.b;
      }
   }

   public dhi d(dhi $$0, csa $$1, ht $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dhi $$0, csb $$1, ht $$2, float $$3) {
      hx $$4 = $$0.c(aE).g();
      hx $$5 = h($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new jm(jm.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dhi $$0) {
      return true;
   }

   private void e(dhi $$0, csa $$1, ht $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(K, aE, b);
   }
}
