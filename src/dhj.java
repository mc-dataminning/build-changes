import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dhj extends dky {
   public static final MapCodec<dhj> b = b(dhj::new);
   private static final Map<ih, est> e = Maps.immutableEnumMap(
      Map.of(
         ih.c,
         dby.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ih.d,
         dby.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ih.f,
         dby.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ih.e,
         dby.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dhj> a() {
      return b;
   }

   public dhj(doy.d $$0) {
      super(diz.b.h, $$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return e.get($$0.c(d));
   }
}
