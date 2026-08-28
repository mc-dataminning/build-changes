import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class der extends dfh implements dmi {
   public static final dtb d = dta.C;
   private static final ewy a = dfh.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected der(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends der> a();

   protected void a(dsk $$0, dcg $$1, ja $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dsk $$0, dbl $$1, ja $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jf $$3 : jf.values()) {
            if ($$1.b_($$2.a($$3)).a(awc.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(awc.a) && $$1.e() == 8));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return a;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return $$1 == jf.a && !this.a($$0, (dci)$$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, jf.b);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(d);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(d) ? eoi.c.a(false) : super.b_($$0);
   }
}
