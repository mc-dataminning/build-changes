import com.mojang.serialization.MapCodec;

public class dhb extends dby {
   public static final MapCodec<dhb> a = b(dhb::new);
   public static final dpx<ih.a> b = dpp.H;
   protected static final int c = 2;
   protected static final est d = dby.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final est e = dby.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   public dhb(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.a.a));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      switch ((ih.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$1.D_().j() && $$1.aa().b(cyt.e) && $$3.a(2000) < $$1.ak().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bqb.bw)) {
            bpv $$4 = bqb.bw.a($$1, $$2.c(), bqs.d);
            if ($$4 != null) {
               $$4.au();
            }
         }
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      ih.a $$6 = $$1.o();
      ih.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new els($$3, $$4, $$7).c() ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if ($$3.ct()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aum.ul, aun.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(kl.aa, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return crj.i;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ih.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, ih.a.a);
               case a:
                  return $$0.a(b, ih.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }
}
