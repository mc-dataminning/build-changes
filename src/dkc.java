import com.mojang.serialization.MapCodec;

public class dkc extends dey {
   public static final MapCodec<dkc> a = b(dkc::new);
   public static final dsz<je.a> b = dsr.H;
   protected static final int c = 2;
   protected static final ewj d = dey.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ewj e = dey.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   public dkc(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.a.a));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      switch ((je.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$1.D_().j() && $$1.ab().b(dbt.e) && $$3.a(2000) < $$1.al().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bsz.bx)) {
            bst $$4 = bsz.bx.a($$1, $$2.c(), bts.d);
            if ($$4 != null) {
               $$4.aw();
            }
         }
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      je.a $$6 = $$1.o();
      je.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new eou($$3, $$4, $$7).c() ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if ($$3.cw()) {
         $$3.g($$2);
      }
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avz.uE, awa.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return cuo.l;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
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
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }
}
