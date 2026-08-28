import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dth extends dov {
   private static final Map<jb.a, ffw> b = fft.b(dmr.a(4.0, 4.0, 16.0));

   protected dth(eas.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dth> a();

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b.get($$0.c(a).o());
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
