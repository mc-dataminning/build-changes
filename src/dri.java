import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dri extends dmy {
   private static final Map<jo.a, fdo> b = fdl.b(dku.a(4.0, 4.0, 16.0));

   protected dri(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dri> a();

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b.get($$0.c(a).o());
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
