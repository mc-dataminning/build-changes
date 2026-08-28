import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dth extends dxg {
   public static final MapCodec<dth> b = b(dth::new);
   private static final Map<jc, fgw> e = fgt.c(dno.b(10.0, 8.0, 8.0, 16.0));

   @Override
   public MapCodec<dth> a() {
      return b;
   }

   public dth(ebp.d $$0) {
      super(dva.b.h, $$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return e.get($$0.c(d));
   }
}
