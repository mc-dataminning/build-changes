import com.mojang.serialization.MapCodec;

public class dei extends czf {
   public static final MapCodec<dei> a = b(dei::new);
   public static final dnc<ih.a> b = dmu.H;
   protected static final int c = 2;
   protected static final epo d = czf.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final epo e = czf.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dei> a() {
      return a;
   }

   public dei(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.a.a));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      switch ((ih.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$1.E_().j() && $$1.Z().b(cwa.e) && $$3.a(2000) < $$1.aj().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bol.bv)) {
            bof $$4 = bol.bv.a($$1, $$2.c(), bpb.d);
            if ($$4 != null) {
               $$4.au();
            }
         }
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      ih.a $$6 = $$1.o();
      ih.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new eip($$3, $$4, $$7).c() ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if ($$3.cq()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atp.ua, atq.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(kb.Z, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return cpq.h;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
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
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }
}
