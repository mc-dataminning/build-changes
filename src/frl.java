import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class frl extends ftp<bvp, fdo<bvp>> {
   private static final Map<bvp.d, aep> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bvp.d $$1 : bvp.d.values()) {
         $$0.put($$1, new aep(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public frl(fsj.a $$0) {
      super($$0, new fdo<>($$0.a(fhi.e)), 0.5F);
   }

   public aep a(bvp $$0) {
      return a.get($$0.fZ());
   }
}
