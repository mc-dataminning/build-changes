import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class czj extends dak {
   public static final dke<djr> K = djw.U;

   protected czj(djf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czj> a();

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(ctr $$0, hx $$1, ic $$2) {
      hx $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      for (ic $$1 : $$0.f()) {
         djg $$2;
         if ($$1.o() == ic.a.b) {
            $$2 = this.o().a(K, $$1 == ic.b ? djr.c : djr.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, djr.b).a(aE, $$1.g());
         }

         if ($$2.a((ctr)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ic h(djg $$0) {
      switch ((djr)$$0.c(K)) {
         case c:
            return ic.a;
         case a:
            return ic.b;
         default:
            return $$0.c(aE);
      }
   }
}
