import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dif extends diw {
   public static final dxs<jn> a = dni.aF;
   public static final dxm b = dxl.v;

   protected dif(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jn.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dif> a();

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bsi.a;
   }

   protected abstract void a(dgg var1, ji var2, cov var3);

   @Override
   public dwv a(dae $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dtx $$5 = $$1.c_($$2);
         if ($$5 instanceof dtl) {
            if ($$1 instanceof arc) {
               bse.a($$1, $$2, (dtl)$$5);
               ((dtl)$$5).a((arc)$$1, fay.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return csa.a($$1.c_($$2));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dtx> dty<T> a(dgg $$0, dtz<T> $$1, dtz<? extends dtl> $$2) {
      return $$0 instanceof arc $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dtl.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
