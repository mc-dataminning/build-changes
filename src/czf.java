import com.mojang.serialization.MapCodec;

public class czf extends cxm {
   public static final MapCodec<czf> a = b(czf::new);
   public static final dhn b = dhm.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final ekb f = cut.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final ekb g = cut.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final ekb h = cut.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final ekb i = cut.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final ekb j = cut.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final ekb k = cut.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final ekb l = cut.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final ekb m = cut.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<czf> a() {
      return a;
   }

   protected czf(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, hx.c).a(b, Boolean.valueOf(false)).a(K, dhh.b));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      switch ((dhh)$$0.c(K)) {
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
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         dgw $$6 = $$0.a(b);
         if ($$6.c(b)) {
            a($$6, $$1, $$2, 1.0F);
         }

         return biq.a;
      } else {
         dgw $$7 = this.d($$0, $$1, $$2);
         float $$8 = $$7.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, aqn.mw, aqo.e, 0.3F, $$8);
         $$1.a($$3, $$7.c(b) ? dlg.a : dlg.e, $$2);
         return biq.b;
      }
   }

   public dgw d(dgw $$0, crs $$1, ht $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dgw $$0, crt $$1, ht $$2, float $$3) {
      hx $$4 = $$0.c(aE).g();
      hx $$5 = h($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new jm(jm.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   private void e(dgw $$0, crs $$1, ht $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(K, aE, b);
   }
}
