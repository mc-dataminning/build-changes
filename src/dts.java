import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dts extends dpg {
   private static final Map<jb.a, fgk> b = fgh.b(dnc.a(4.0, 4.0, 16.0));

   protected dts(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dts> a();

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b.get($$0.c(a).o());
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
