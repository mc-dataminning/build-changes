import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class cym extends dby {
   public static final MapCodec<cym> b = b(cym::new);
   private static final Map<ha, eia> e = Maps.immutableEnumMap(
      Map.of(
         ha.c,
         ctc.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ha.d,
         ctc.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ha.f,
         ctc.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ha.e,
         ctc.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<cym> a() {
      return b;
   }

   public cym(dfc.d $$0) {
      super(dac.b.h, $$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return e.get($$0.c(d));
   }
}
