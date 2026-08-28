import com.mojang.serialization.MapCodec;

public class dke extends dfa {
   public static final MapCodec<dke> a = b(dke::new);
   public static final dtb<je.a> b = dst.H;
   protected static final int c = 2;
   protected static final ewl d = dfa.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ewl e = dfa.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   public dke(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.a.a));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      switch ((je.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.D_().j() && $$1.ab().b(dbv.e) && $$3.a(2000) < $$1.al().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, btb.bx)) {
            bsv $$4 = btb.bx.a($$1, $$2.c(), btu.d);
            if ($$4 != null) {
               $$4.aw();
            }
         }
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      je.a $$6 = $$1.o();
      je.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new eow($$3, $$4, $$7).c() ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if ($$3.cw()) {
         $$3.g($$2);
      }
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
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
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return cuq.l;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
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
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }
}
