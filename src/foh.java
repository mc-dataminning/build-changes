import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class foh<T extends btj> extends fnu<T, fat<T>> {
   private static final Map<bfn<?>, acq> a = Maps.newHashMap(
      ImmutableMap.of(bfn.w, new acq("textures/entity/horse/donkey.png"), bfn.ap, new acq("textures/entity/horse/mule.png"))
   );

   public foh(foy.a $$0, float $$1, fec $$2) {
      super($$0, new fat<>($$0.a($$2)), $$1);
   }

   public acq a(T $$0) {
      return a.get($$0.ae());
   }
}
