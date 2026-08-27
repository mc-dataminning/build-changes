import com.mojang.serialization.MapCodec;

public class dcb extends cwy {
   public static final MapCodec<dcb> a = b(dcb::new);
   public static final dkn<ic.a> b = dkf.H;
   protected static final int c = 2;
   protected static final emv d = cwy.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final emv e = cwy.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dcb> a() {
      return a;
   }

   public dcb(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.a.a));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      switch ((ic.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$1.E_().j() && $$1.Z().b(ctt.e) && $$3.a(2000) < $$1.ak().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bmc.bv)) {
            blw $$4 = bmc.bv.a($$1, $$2.c(), bms.d);
            if ($$4 != null) {
               $$4.au();
            }
         }
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      ic.a $$6 = $$1.o();
      ic.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new efx($$3, $$4, $$7).c() ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if ($$3.ct()) {
         $$3.g($$2);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, art.tZ, aru.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(jx.Z, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return cng.f;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ic.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, ic.a.a);
               case a:
                  return $$0.a(b, ic.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }
}
