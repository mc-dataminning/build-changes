import com.mojang.serialization.MapCodec;

public class dad extends cva {
   public static final MapCodec<dad> a = b(dad::new);
   public static final dig<hx.a> b = dhy.H;
   protected static final int c = 2;
   protected static final ekn d = cva.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ekn e = cva.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dad> a() {
      return a;
   }

   public dad(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.a.a));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      switch ((hx.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$1.D_().j() && $$1.Y().b(crw.e) && $$3.a(2000) < $$1.aj().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bku.bs)) {
            bkq $$4 = bku.bs.a($$1, $$2.c(), blk.d);
            if ($$4 != null) {
               $$4.au();
            }
         }
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      hx.a $$6 = $$1.o();
      hx.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new edq($$3, $$4, $$7).c() ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if ($$3.ct()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqr.tp, aqs.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return clj.b;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
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
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }
}
