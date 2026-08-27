import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fsl extends fup<bwa, fej<bwa>> {
   private static final Map<bwa.d, aey> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bwa.d $$1 : bwa.d.values()) {
         $$0.put($$1, new aey(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fsl(ftj.a $$0) {
      super($$0, new fej<>($$0.a(fid.e)), 0.5F);
   }

   public aey a(bwa $$0) {
      return a.get($$0.gd());
   }
}
