import com.google.common.collect.Maps;
import java.util.Map;

public class cya extends dbp {
   private static final Map<hc, eib> c = Maps.immutableEnumMap(
      Map.of(
         hc.c,
         csq.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         hc.d,
         csq.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         hc.f,
         csq.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         hc.e,
         csq.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   public cya(dfd.d $$0) {
      super(czs.b.f, $$0);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return c.get($$0.c(b));
   }
}
