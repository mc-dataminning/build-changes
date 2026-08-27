import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class czs extends dat {
   public static final dkn<dka> K = dkf.U;

   protected czs(djo.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czs> a();

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(cua $$0, hx $$1, ic $$2) {
      hx $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      for (ic $$1 : $$0.f()) {
         djp $$2;
         if ($$1.o() == ic.a.b) {
            $$2 = this.o().a(K, $$1 == ic.b ? dka.c : dka.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dka.b).a(aE, $$1.g());
         }

         if ($$2.a((cua)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ic h(djp $$0) {
      switch ((dka)$$0.c(K)) {
         case c:
            return ic.a;
         case a:
            return ic.b;
         default:
            return $$0.c(aE);
      }
   }
}
