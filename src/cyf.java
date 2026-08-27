import com.google.common.collect.Maps;
import java.util.Map;

public class cyf extends dbu {
   private static final Map<hc, eig> c = Maps.immutableEnumMap(
      Map.of(
         hc.c,
         csv.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         hc.d,
         csv.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         hc.f,
         csv.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         hc.e,
         csv.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   public cyf(dfi.d $$0) {
      super(czx.b.f, $$0);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return c.get($$0.c(b));
   }
}
