import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fst<T extends bwr> extends fsg<T, fet<T>> {
   private static final Map<biw<?>, aey> a = Maps.newHashMap(
      ImmutableMap.of(biw.w, new aey("textures/entity/horse/donkey.png"), biw.ap, new aey("textures/entity/horse/mule.png"))
   );

   public fst(ftj.a $$0, float $$1, fic $$2) {
      super($$0, new fet<>($$0.a($$2)), $$1);
   }

   public aey a(T $$0) {
      return a.get($$0.ag());
   }
}
