import com.google.common.collect.Maps;
import java.util.Map;

public class cux extends cym {
   private static final Map<ha, efb> b = Maps.immutableEnumMap(
      Map.of(
         ha.c,
         cpn.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ha.d,
         cpn.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ha.f,
         cpn.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ha.e,
         cpn.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   public cux(dca.d $$0) {
      super(cwp.b.f, $$0);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return b.get($$0.c(a));
   }
}
