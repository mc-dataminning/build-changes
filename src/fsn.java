import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fsn<T extends bwv> extends fsa<T, fem<T>> {
   private static final Map<bja<?>, aez> a = Maps.newHashMap(
      ImmutableMap.of(bja.w, new aez("textures/entity/horse/donkey.png"), bja.ap, new aez("textures/entity/horse/mule.png"))
   );

   public fsn(ftd.a $$0, float $$1, fhv $$2) {
      super($$0, new fem<>($$0.a($$2)), $$1);
   }

   public aez a(T $$0) {
      return a.get($$0.ag());
   }
}
