import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dlk extends dpa {
   public static final MapCodec<dlk> b = b(dlk::new);
   private static final Map<ji, exv> e = Maps.immutableEnumMap(
      Map.of(
         ji.c,
         dfy.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ji.d,
         dfy.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ji.f,
         dfy.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ji.e,
         dfy.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dlk> a() {
      return b;
   }

   public dlk(dtb.d $$0) {
      super(dnb.b.h, $$0);
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return e.get($$0.c(d));
   }
}
