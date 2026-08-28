import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dtu extends dpi {
   private static final Map<jc.a, fgm> b = fgj.b(dne.a(4.0, 4.0, 16.0));

   protected dtu(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dtu> a();

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b.get($$0.c(a).o());
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
