import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dcb extends dfp {
   public static final MapCodec<dcb> b = b(dcb::new);
   private static final Map<ic, emm> e = Maps.immutableEnumMap(
      Map.of(
         ic.c,
         cwq.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ic.d,
         cwq.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ic.f,
         cwq.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ic.e,
         cwq.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dcb> a() {
      return b;
   }

   public dcb(djg.d $$0) {
      super(ddr.b.h, $$0);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return e.get($$0.c(d));
   }
}
