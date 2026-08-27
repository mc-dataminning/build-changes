import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dal extends ddy {
   public static final MapCodec<dal> b = b(dal::new);
   private static final Map<hx, ekn> e = Maps.immutableEnumMap(
      Map.of(
         hx.c,
         cva.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         hx.d,
         cva.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         hx.f,
         cva.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         hx.e,
         cva.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dal> a() {
      return b;
   }

   public dal(dhh.d $$0) {
      super(dcb.b.h, $$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return e.get($$0.c(d));
   }
}
