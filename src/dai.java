import com.mojang.serialization.MapCodec;

public class dai extends cvf {
   public static final MapCodec<dai> a = b(dai::new);
   public static final dil<ib.a> b = did.H;
   protected static final int c = 2;
   protected static final eks d = cvf.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eks e = cvf.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dai> a() {
      return a;
   }

   public dai(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.a.a));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      switch ((ib.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$1.E_().j() && $$1.Y().b(csb.e) && $$3.a(2000) < $$1.aj().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bkz.bs)) {
            bkv $$4 = bkz.bs.a($$1, $$2.c(), blp.d);
            if ($$4 != null) {
               $$4.au();
            }
         }
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      ib.a $$6 = $$1.o();
      ib.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new edv($$3, $$4, $$7).c() ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if ($$3.ct()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqv.tp, aqw.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
      }

      for (int $$4 = 0; $$4 < 4; $$4++) {
         double $$5 = (double)$$2.u() + $$3.j();
         double $$6 = (double)$$2.v() + $$3.j();
         double $$7 = (double)$$2.w() + $$3.j();
         double $$8 = ((double)$$3.i() - 0.5) * 0.5;
         double $$9 = ((double)$$3.i() - 0.5) * 0.5;
         double $$10 = ((double)$$3.i() - 0.5) * 0.5;
         int $$11 = $$3.a(2) * 2 - 1;
         if (!$$1.a_($$2.g()).a(this) && !$$1.a_($$2.h()).a(this)) {
            $$5 = (double)$$2.u() + 0.5 + 0.25 * (double)$$11;
            $$8 = (double)($$3.i() * 2.0F * (float)$$11);
         } else {
            $$7 = (double)$$2.w() + 0.5 + 0.25 * (double)$$11;
            $$10 = (double)($$3.i() * 2.0F * (float)$$11);
         }

         $$1.a(jw.X, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return clo.b;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ib.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, ib.a.a);
               case a:
                  return $$0.a(b, ib.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }
}
