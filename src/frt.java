import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class frt<T extends bwg> extends frg<T, fdy<T>> {
   private static final Map<bik<?>, aep> a = Maps.newHashMap(
      ImmutableMap.of(bik.w, new aep("textures/entity/horse/donkey.png"), bik.ap, new aep("textures/entity/horse/mule.png"))
   );

   public frt(fsj.a $$0, float $$1, fhh $$2) {
      super($$0, new fdy<>($$0.a($$2)), $$1);
   }

   public aep a(T $$0) {
      return a.get($$0.ag());
   }
}
