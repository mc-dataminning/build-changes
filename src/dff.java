import com.mojang.serialization.MapCodec;

public class dff extends dac {
   public static final MapCodec<dff> a = b(dff::new);
   public static final dnz<ih.a> b = dnr.H;
   protected static final int c = 2;
   protected static final eqm d = dac.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eqm e = dac.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dff> a() {
      return a;
   }

   public dff(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.a.a));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      switch ((ih.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.D_().j() && $$1.Z().b(cwx.e) && $$3.a(2000) < $$1.aj().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bpd.bx)) {
            box $$4 = bpd.bx.a($$1, $$2.c(), bpt.d);
            if ($$4 != null) {
               $$4.au();
            }
         }
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      ih.a $$6 = $$1.o();
      ih.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new ejn($$3, $$4, $$7).c() ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if ($$3.ct()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aty.ui, atz.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(kc.aa, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return cqm.h;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
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
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }
}
