import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dsv extends doj {
   private static final Map<ja.a, ffk> b = ffh.b(dmf.a(4.0, 4.0, 16.0));

   protected dsv(eag.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dsv> a();

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b.get($$0.c(a).o());
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
