import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class frz extends fud<bvq, fdx<bvq>> {
   private static final Map<bvq.d, aer> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bvq.d $$1 : bvq.d.values()) {
         $$0.put($$1, new aer(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public frz(fsx.a $$0) {
      super($$0, new fdx<>($$0.a(fhr.e)), 0.5F);
   }

   public aer a(bvq $$0) {
      return a.get($$0.ga());
   }
}
