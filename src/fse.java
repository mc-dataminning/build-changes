import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fse extends fui<bvt, fec<bvt>> {
   private static final Map<bvt.d, aeu> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bvt.d $$1 : bvt.d.values()) {
         $$0.put($$1, new aeu(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fse(ftc.a $$0) {
      super($$0, new fec<>($$0.a(fhw.e)), 0.5F);
   }

   public aeu a(bvt $$0) {
      return a.get($$0.ga());
   }
}
