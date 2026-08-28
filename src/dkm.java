import com.mojang.serialization.MapCodec;

public class dkm extends dfi {
   public static final MapCodec<dkm> a = b(dkm::new);
   public static final dtj<jf.a> b = dtb.H;
   protected static final int c = 2;
   protected static final exa d = dfi.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final exa e = dfi.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   public dkm(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.a.a));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      switch ((jf.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.D_().j() && $$1.ab().b(dcc.e) && $$3.a(2000) < $$1.al().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bsn.bx)) {
            bsh $$4 = bsn.bx.a($$1, $$2.c(), btg.d);
            if ($$4 != null) {
               $$4.ay();
            }
         }
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      jf.a $$6 = $$1.o();
      jf.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new epj($$3, $$4, $$7).c() ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if ($$3.cy()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avh.uH, avi.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(lj.ac, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return cud.l;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jf.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, jf.a.a);
               case a:
                  return $$0.a(b, jf.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }
}
