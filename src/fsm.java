import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fsm<T extends bwk> extends frz<T, fem<T>> {
   private static final Map<bip<?>, aeu> a = Maps.newHashMap(
      ImmutableMap.of(bip.w, new aeu("textures/entity/horse/donkey.png"), bip.ap, new aeu("textures/entity/horse/mule.png"))
   );

   public fsm(ftc.a $$0, float $$1, fhv $$2) {
      super($$0, new fem<>($$0.a($$2)), $$1);
   }

   public aeu a(T $$0) {
      return a.get($$0.ag());
   }
}
