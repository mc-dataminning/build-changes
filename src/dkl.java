import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dkl extends doa {
   public static final MapCodec<dkl> b = b(dkl::new);
   private static final Map<je, ewk> e = Maps.immutableEnumMap(
      Map.of(
         je.c,
         dez.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         je.d,
         dez.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         je.f,
         dez.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         je.e,
         dez.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dkl> a() {
      return b;
   }

   public dkl(dsb.d $$0) {
      super(dmb.b.h, $$0);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return e.get($$0.c(d));
   }
}
