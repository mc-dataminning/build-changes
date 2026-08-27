import com.mojang.serialization.MapCodec;

public class czw extends cut {
   public static final MapCodec<czw> a = b(czw::new);
   public static final dhu<hx.a> b = dhm.H;
   protected static final int c = 2;
   protected static final ekb d = cut.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ekb e = cut.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<czw> a() {
      return a;
   }

   public czw(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.a.a));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      switch ((hx.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$1.D_().j() && $$1.X().b(cro.e) && $$3.a(2000) < $$1.ai().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bkm.bs)) {
            bki $$4 = bkm.bs.a($$1, $$2.c(), blc.d);
            if ($$4 != null) {
               $$4.as();
            }
         }
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      hx.a $$6 = $$1.o();
      hx.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new ede($$3, $$4, $$7).c() ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if ($$3.cs()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqn.sY, aqo.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(js.X, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return clb.b;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((hx.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, hx.a.a);
               case a:
                  return $$0.a(b, hx.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }
}
