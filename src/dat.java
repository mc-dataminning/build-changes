import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dat extends dbk {
   public static final dpt a = dft.aE;
   public static final dpq b = dpp.r;

   protected dat(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dat> a();

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         this.a($$1, $$2, $$3);
         return boa.b;
      }
   }

   protected abstract void a(cyx var1, ib var2, cjt var3);

   @Override
   public doz a(cuo $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dmf $$5 = $$1.c_($$2);
         if ($$5 instanceof dlt) {
            if ($$1 instanceof aps) {
               bnw.a($$1, $$2, (dlt)$$5);
               ((dlt)$$5).a((aps)$$1, esa.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return cmp.a($$1.c_($$2));
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dmf> dmg<T> a(cyx $$0, dmh<T> $$1, dmh<? extends dlt> $$2) {
      return $$0.B ? null : a($$1, $$2, dlt::a);
   }
}
