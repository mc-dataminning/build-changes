import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class czk extends dal {
   public static final dkf<djs> K = djx.U;

   protected czk(djg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czk> a();

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(cts $$0, hx $$1, ic $$2) {
      hx $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      for (ic $$1 : $$0.f()) {
         djh $$2;
         if ($$1.o() == ic.a.b) {
            $$2 = this.o().a(K, $$1 == ic.b ? djs.c : djs.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, djs.b).a(aE, $$1.g());
         }

         if ($$2.a((cts)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ic h(djh $$0) {
      switch ((djs)$$0.c(K)) {
         case c:
            return ic.a;
         case a:
            return ic.b;
         default:
            return $$0.c(aE);
      }
   }
}
