import com.mojang.serialization.MapCodec;

public class dkl extends dfc {
   public static final MapCodec<dkl> a = b(dkl::new);
   public static final dua<iw.a> b = dts.H;
   protected static final int c = 2;
   protected static final exn d = dfc.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final exn e = dfc.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   public dkl(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iw.a.a));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      switch ((iw.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$1.E_().j() && $$1.ab().b(dbw.e) && $$3.a(2000) < $$1.al().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bsb.bC)) {
            brv $$4 = bsb.bC.a($$1, $$2.c(), bss.d);
            if ($$4 != null) {
               $$4.aw();
            }
         }
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      iw.a $$6 = $$1.o();
      iw.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new eqe($$3, $$4, $$7).c() ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if ($$3.cB()) {
         $$3.h($$2);
      }
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avo.vc, avq.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(lb.aa, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return cuh.i;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((iw.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, iw.a.a);
               case a:
                  return $$0.a(b, iw.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }
}
