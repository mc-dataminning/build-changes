import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dih extends dlw {
   public static final MapCodec<dih> b = b(dih::new);
   private static final Map<ir, ety> e = Maps.immutableEnumMap(
      Map.of(
         ir.c,
         dcv.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ir.d,
         dcv.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ir.f,
         dcv.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ir.e,
         dcv.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dih> a() {
      return b;
   }

   public dih(dpx.d $$0) {
      super(djx.b.h, $$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return e.get($$0.c(d));
   }
}
