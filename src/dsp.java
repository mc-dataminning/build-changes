import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dsp extends doe {
   private static final Map<ja.a, ffc> b = fez.b(dma.a(4.0, 4.0, 16.0));

   protected dsp(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dsp> a();

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b.get($$0.c(a).o());
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
