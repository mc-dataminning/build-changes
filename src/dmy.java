import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dmy extends dqo {
   public static final MapCodec<dmy> b = b(dmy::new);
   private static final Map<jk, ezq> e = Maps.immutableEnumMap(
      Map.of(
         jk.c,
         dhm.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jk.d,
         dhm.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jk.f,
         dhm.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jk.e,
         dhm.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dmy> a() {
      return b;
   }

   public dmy(dur.d $$0) {
      super(dop.b.h, $$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return e.get($$0.c(d));
   }
}
