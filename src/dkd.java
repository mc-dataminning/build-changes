import com.mojang.serialization.MapCodec;

public class dkd extends dez {
   public static final MapCodec<dkd> a = b(dkd::new);
   public static final dta<je.a> b = dss.H;
   protected static final int c = 2;
   protected static final ewk d = dez.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ewk e = dez.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   public dkd(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.a.a));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      switch ((je.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.D_().j() && $$1.ab().b(dbu.e) && $$3.a(2000) < $$1.al().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bta.bx)) {
            bsu $$4 = bta.bx.a($$1, $$2.c(), btt.d);
            if ($$4 != null) {
               $$4.aw();
            }
         }
      }
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      je.a $$6 = $$1.o();
      je.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new eov($$3, $$4, $$7).c() ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if ($$3.cw()) {
         $$3.g($$2);
      }
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.uE, awb.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(li.ac, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return cup.l;
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((je.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, je.a.a);
               case a:
                  return $$0.a(b, je.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }
}
