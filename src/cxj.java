import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cxj extends cya {
   public static final dlz a = dcj.aE;
   public static final dlw b = dlv.r;

   protected cxj(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ie.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cxj> a();

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         this.a($$1, $$2, $$3);
         return blu.b;
      }
   }

   protected abstract void a(cvn var1, hz var2, chh var3);

   @Override
   public dlf a(crg $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
      if ($$4.B()) {
         dit $$5 = $$0.c_($$1);
         if ($$5 instanceof dii) {
            ((dii)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dit $$5 = $$1.c_($$2);
         if ($$5 instanceof dii) {
            if ($$1 instanceof aov) {
               blq.a($$1, $$2, (dii)$$5);
               ((dii)$$5).a((aov)$$1, ens.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return ckb.a($$1.c_($$2));
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dit> diu<T> a(cvn $$0, div<T> $$1, div<? extends dii> $$2) {
      return $$0.B ? null : a($$1, $$2, dii::a);
   }
}
