import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class ftn<T extends bxs> extends fta<T, ffl<T>> {
   private static final Map<bjx<?>, afw> a = Maps.newHashMap(
      ImmutableMap.of(bjx.w, new afw("textures/entity/horse/donkey.png"), bjx.ap, new afw("textures/entity/horse/mule.png"))
   );

   public ftn(fud.a $$0, float $$1, fiu $$2) {
      super($$0, new ffl<>($$0.a($$2)), $$1);
   }

   public afw a(T $$0) {
      return a.get($$0.ag());
   }
}
