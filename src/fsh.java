import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fsh<T extends bwh> extends fru<T, feh<T>> {
   private static final Map<bim<?>, aer> a = Maps.newHashMap(
      ImmutableMap.of(bim.w, new aer("textures/entity/horse/donkey.png"), bim.ap, new aer("textures/entity/horse/mule.png"))
   );

   public fsh(fsx.a $$0, float $$1, fhq $$2) {
      super($$0, new feh<>($$0.a($$2)), $$1);
   }

   public aer a(T $$0) {
      return a.get($$0.ag());
   }
}
