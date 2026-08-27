import com.google.common.collect.Maps;
import java.util.Map;

public class cxw extends dbl {
   private static final Map<ha, ehx> b = Maps.immutableEnumMap(
      Map.of(
         ha.c,
         csm.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ha.d,
         csm.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ha.f,
         csm.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ha.e,
         csm.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   public cxw(dez.d $$0) {
      super(czo.b.f, $$0);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return b.get($$0.c(a));
   }
}
