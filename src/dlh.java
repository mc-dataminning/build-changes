import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlh extends dly {
   public static final ebm<jb> a = dqn.e;
   public static final ebf b = ebe.u;

   protected dlh(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jb.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dlh> a();

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bug.a;
   }

   protected abstract void a(djh var1, iv var2, crj var3);

   @Override
   public eao a(ddd $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return cvc.a($$1.c_($$2));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dxm> dxn<T> a(djh $$0, dxo<T> $$1, dxo<? extends dwz> $$2) {
      return $$0 instanceof arq $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dwz.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
