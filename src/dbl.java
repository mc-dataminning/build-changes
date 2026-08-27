import com.mojang.serialization.MapCodec;

public class dbl extends cxh {
   public static final MapCodec<dbl> a = b(dbl::new);
   public static final die b = did.s;
   public static final din e = did.aA;

   @Override
   public MapCodec<dbl> a() {
      return a;
   }

   protected dbl(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ib.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if (!$$3.fU().e) {
         return bjb.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bjb.a($$1.B);
      }
   }

   @Override
   protected int g(dhn $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == ib.a && !this.b($$3, $$5, $$2)) {
         return cvh.a.o();
      } else {
         return !$$3.y_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(csi $$0, hx $$1, dhn $$2) {
      return this.a((csv)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$0.c(d)) {
         ib $$4 = $$0.c(aE);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(e) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(jq.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(aE, e, b, d);
   }
}
