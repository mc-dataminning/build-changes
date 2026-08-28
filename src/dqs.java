import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dqs extends dmi {
   private static final Map<jn.a, fcr> b = fco.b(dke.a(4.0, 4.0, 16.0));

   protected dqs(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqs> a();

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b.get($$0.c(a).o());
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
