import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dcj extends dfx {
   public static final MapCodec<dcj> b = b(dcj::new);
   private static final Map<ic, emv> e = Maps.immutableEnumMap(
      Map.of(
         ic.c,
         cwy.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ic.d,
         cwy.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ic.f,
         cwy.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ic.e,
         cwy.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dcj> a() {
      return b;
   }

   public dcj(djo.d $$0) {
      super(ddz.b.h, $$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return e.get($$0.c(d));
   }
}
