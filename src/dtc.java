import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dtc extends doq {
   private static final Map<jb.a, ffr> b = ffo.b(dmm.a(4.0, 4.0, 16.0));

   protected dtc(ean.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dtc> a();

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b.get($$0.c(a).o());
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
