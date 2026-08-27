import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fsr<T extends bwp> extends fse<T, fer<T>> {
   private static final Map<biu<?>, aex> a = Maps.newHashMap(
      ImmutableMap.of(biu.w, new aex("textures/entity/horse/donkey.png"), biu.ap, new aex("textures/entity/horse/mule.png"))
   );

   public fsr(fth.a $$0, float $$1, fia $$2) {
      super($$0, new fer<>($$0.a($$2)), $$1);
   }

   public aex a(T $$0) {
      return a.get($$0.ah());
   }
}
