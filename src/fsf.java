import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fsf extends fuj<bwe, fec<bwe>> {
   private static final Map<bwe.d, aez> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bwe.d $$1 : bwe.d.values()) {
         $$0.put($$1, new aez(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fsf(ftd.a $$0) {
      super($$0, new fec<>($$0.a(fhw.e)), 0.5F);
   }

   public aez a(bwe $$0) {
      return a.get($$0.ge());
   }
}
