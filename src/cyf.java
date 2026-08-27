import com.google.common.collect.Maps;
import java.util.Map;

public class cyf extends dbu {
   private static final Map<ha, eig> c = Maps.immutableEnumMap(
      Map.of(
         ha.c,
         csv.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ha.d,
         csv.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ha.f,
         csv.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ha.e,
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
