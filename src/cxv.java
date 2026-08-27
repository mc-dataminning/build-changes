import com.google.common.collect.Maps;
import java.util.Map;

public class cxv extends dbk {
   private static final Map<ha, ehw> b = Maps.immutableEnumMap(
      Map.of(
         ha.c,
         csl.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ha.d,
         csl.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ha.f,
         csl.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ha.e,
         csl.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   public cxv(dey.d $$0) {
      super(czn.b.f, $$0);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return b.get($$0.c(a));
   }
}
