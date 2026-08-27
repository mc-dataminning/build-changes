import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cxn extends cye {
   public static final dmd a = dcn.aE;
   public static final dma b = dlz.r;

   protected cxn(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ie.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cxn> a();

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         this.a($$1, $$2, $$3);
         return blw.b;
      }
   }

   protected abstract void a(cvr var1, hz var2, chl var3);

   @Override
   public dlj a(crk $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      if ($$4.B()) {
         dix $$5 = $$0.c_($$1);
         if ($$5 instanceof dim) {
            ((dim)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dix $$5 = $$1.c_($$2);
         if ($$5 instanceof dim) {
            if ($$1 instanceof aow) {
               bls.a($$1, $$2, (dim)$$5);
               ((dim)$$5).a((aow)$$1, enz.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return ckf.a($$1.c_($$2));
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dix> diy<T> a(cvr $$0, diz<T> $$1, diz<? extends dim> $$2) {
      return $$0.B ? null : a($$1, $$2, dim::a);
   }
}
