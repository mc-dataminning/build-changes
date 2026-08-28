import com.mojang.serialization.MapCodec;

public class dle extends dgz {
   public static final MapCodec<dle> a = b(dle::new);
   public static final dsr b = dsq.s;
   public static final dta e = dsq.aA;

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   protected dle(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, je.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if (!$$3.gd().e) {
         return bqs.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bqs.a($$1.B);
      }
   }

   @Override
   protected int g(dsa $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !this.b($$3, $$5, $$2)) {
         return dez.a.o();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(dbz $$0, iz $$1, dsa $$2) {
      return this.a((dcm)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      if ($$0.c(d)) {
         je $$4 = $$0.c(aE);
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
         $$1.a(ld.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(aE, e, b, d);
   }
}
