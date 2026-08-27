import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class ded extends dhr {
   public static final MapCodec<ded> b = b(ded::new);
   private static final Map<ie, eos> e = Maps.immutableEnumMap(
      Map.of(
         ie.c,
         cys.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ie.d,
         cys.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ie.f,
         cys.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ie.e,
         cys.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<ded> a() {
      return b;
   }

   public ded(dli.d $$0) {
      super(dft.b.h, $$0);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return e.get($$0.c(d));
   }
}
