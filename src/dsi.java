import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dsi extends dny {
   private static final Map<ja.a, feq> b = fen.b(dlu.a(4.0, 4.0, 16.0));

   protected dsi(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dsi> a();

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b.get($$0.c(a).o());
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
