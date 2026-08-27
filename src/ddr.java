import com.mojang.serialization.MapCodec;

public class ddr extends cyo {
   public static final MapCodec<ddr> a = b(ddr::new);
   public static final dmd<ie.a> b = dlv.H;
   protected static final int c = 2;
   protected static final eol d = cyo.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eol e = cyo.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<ddr> a() {
      return a;
   }

   public ddr(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.a.a));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      switch ((ie.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$1.E_().j() && $$1.Z().b(cvj.e) && $$3.a(2000) < $$1.ak().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bnu.bv)) {
            bno $$4 = bnu.bv.a($$1, $$2.c(), bok.d);
            if ($$4 != null) {
               $$4.au();
            }
         }
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      ie.a $$6 = $$1.o();
      ie.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new ehn($$3, $$4, $$7).c() ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      if ($$3.ct()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atk.tZ, atl.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(jz.Z, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return coz.h;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ie.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, ie.a.a);
               case a:
                  return $$0.a(b, ie.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }
}
