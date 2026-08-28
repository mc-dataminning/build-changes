import com.mojang.serialization.MapCodec;

public class dlo extends dhj {
   public static final MapCodec<dlo> a = b(dlo::new);
   public static final dtb b = dta.s;
   public static final dtk e = dta.aA;

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   protected dlo(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, jf.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if (!$$3.ga().e) {
         return bqg.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bqg.a($$1.B);
      }
   }

   @Override
   protected int g(dsk $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$1 == jf.a && !this.b($$3, $$5, $$2)) {
         return dfj.a.o();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(dci $$0, ja $$1, dsk $$2) {
      return this.a((dcv)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      if ($$0.c(d)) {
         jf $$4 = $$0.c(aE);
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
         $$1.a(le.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(aE, e, b, d);
   }
}
