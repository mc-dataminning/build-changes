import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class daq extends ded {
   public static final MapCodec<daq> b = b(daq::new);
   private static final Map<ib, eks> e = Maps.immutableEnumMap(
      Map.of(
         ib.c,
         cvf.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ib.d,
         cvf.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ib.f,
         cvf.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ib.e,
         cvf.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<daq> a() {
      return b;
   }

   public daq(dhm.d $$0) {
      super(dcg.b.h, $$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return e.get($$0.c(d));
   }
}
