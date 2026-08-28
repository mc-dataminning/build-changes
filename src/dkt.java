import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dkt extends doi {
   public static final MapCodec<dkt> b = b(dkt::new);
   private static final Map<jf, ewy> e = Maps.immutableEnumMap(
      Map.of(
         jf.c,
         dfh.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jf.d,
         dfh.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jf.f,
         dfh.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jf.e,
         dfh.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dkt> a() {
      return b;
   }

   public dkt(dsj.d $$0) {
      super(dmj.b.h, $$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return e.get($$0.c(d));
   }
}
