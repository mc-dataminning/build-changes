import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dec extends det {
   public static final dte a = djd.aE;
   public static final dtb b = dta.r;

   protected dec(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, jf.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dec> a();

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         this.a($$1, $$2, $$3);
         return bqg.c;
      }
   }

   protected abstract void a(dcf var1, ja var2, cmk var3);

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpp $$5 = $$1.c_($$2);
         if ($$5 instanceof dpd) {
            if ($$1 instanceof aqm) {
               bqc.a($$1, $$2, (dpd)$$5);
               ((dpd)$$5).a((aqm)$$1, ewf.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return cph.a($$1.c_($$2));
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dpp> dpq<T> a(dcf $$0, dpr<T> $$1, dpr<? extends dpd> $$2) {
      return $$0.B ? null : a($$1, $$2, dpd::a);
   }
}
