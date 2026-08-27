import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dhs extends dlh {
   public static final MapCodec<dhs> b = b(dhs::new);
   private static final Map<ij, etc> e = Maps.immutableEnumMap(
      Map.of(
         ij.c,
         dch.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ij.d,
         dch.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ij.f,
         dch.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ij.e,
         dch.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dhs> a() {
      return b;
   }

   public dhs(dph.d $$0) {
      super(dji.b.h, $$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return e.get($$0.c(d));
   }
}
