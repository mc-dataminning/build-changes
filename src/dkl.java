import com.mojang.serialization.MapCodec;

public class dkl extends dfh {
   public static final MapCodec<dkl> a = b(dkl::new);
   public static final dti<jf.a> b = dta.H;
   protected static final int c = 2;
   protected static final ewy d = dfh.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ewy e = dfh.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   public dkl(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.a.a));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      switch ((jf.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.D_().j() && $$1.ab().b(dcb.e) && $$3.a(2000) < $$1.al().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bsm.bx)) {
            bsg $$4 = bsm.bx.a($$1, $$2.c(), btf.d);
            if ($$4 != null) {
               $$4.ax();
            }
         }
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      jf.a $$6 = $$1.o();
      jf.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new eph($$3, $$4, $$7).c() ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if ($$3.cx()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
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
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return cuc.l;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
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
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }
}
