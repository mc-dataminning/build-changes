import com.google.common.collect.Maps;
import java.util.Map;

public class cxu extends dbj {
   private static final Map<hb, ehy> b = Maps.immutableEnumMap(
      Map.of(
         hb.c,
         csk.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         hb.d,
         csk.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         hb.f,
         csk.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         hb.e,
         csk.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   public cxu(dex.d $$0) {
      super(czm.b.f, $$0);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b.get($$0.c(a));
   }
}
