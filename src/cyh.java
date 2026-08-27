import com.google.common.collect.Maps;
import java.util.Map;

public class cyh extends dbw {
   private static final Map<hc, eii> c = Maps.immutableEnumMap(
      Map.of(
         hc.c,
         csx.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         hc.d,
         csx.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         hc.f,
         csx.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         hc.e,
         csx.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   public cyh(dfk.d $$0) {
      super(czz.b.f, $$0);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return c.get($$0.c(b));
   }
}
