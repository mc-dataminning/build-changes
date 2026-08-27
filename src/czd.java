import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class czd extends dae {
   public static final djy<djl> K = djq.U;

   protected czd(diz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czd> a();

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(ctl $$0, hx $$1, ic $$2) {
      hx $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      for (ic $$1 : $$0.f()) {
         dja $$2;
         if ($$1.o() == ic.a.b) {
            $$2 = this.o().a(K, $$1 == ic.b ? djl.c : djl.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, djl.b).a(aE, $$1.g());
         }

         if ($$2.a((ctl)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ic h(dja $$0) {
      switch ((djl)$$0.c(K)) {
         case c:
            return ic.a;
         case a:
            return ic.b;
         default:
            return $$0.c(aE);
      }
   }
}
