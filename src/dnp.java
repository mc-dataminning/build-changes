import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dnp extends drf {
   public static final MapCodec<dnp> b = b(dnp::new);
   private static final Map<jm, fah> e = Maps.immutableEnumMap(
      Map.of(
         jm.c,
         die.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jm.d,
         die.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jm.f,
         die.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jm.e,
         die.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dnp> a() {
      return b;
   }

   public dnp(dvi.d $$0) {
      super(dpg.b.h, $$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return e.get($$0.c(d));
   }
}
