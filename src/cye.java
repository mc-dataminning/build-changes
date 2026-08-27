import com.mojang.serialization.MapCodec;

public class cye extends ctc {
   public static final MapCodec<cye> a = b(cye::new);
   public static final dgb<ha.a> b = dft.H;
   protected static final int c = 2;
   protected static final eia d = ctc.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eia e = ctc.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<cye> a() {
      return a;
   }

   public cye(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.a.a));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      switch ((ha.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$1.C_().j() && $$1.X().b(cpx.e) && $$3.a(2000) < $$1.ai().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bja.bs)) {
            biw $$4 = bja.bs.a($$1, $$2.c(), bjq.d);
            if ($$4 != null) {
               $$4.as();
            }
         }
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      ha.a $$6 = $$1.o();
      ha.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new ebe($$3, $$4, $$7).c() ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if ($$3.cs()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apg.sU, aph.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(iv.X, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return cjl.b;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ha.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, ha.a.a);
               case a:
                  return $$0.a(b, ha.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }
}
