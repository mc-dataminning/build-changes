import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class frq extends ftu<bvr, fds<bvr>> {
   private static final Map<bvr.d, aer> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bvr.d $$1 : bvr.d.values()) {
         $$0.put($$1, new aer(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public frq(fso.a $$0) {
      super($$0, new fds<>($$0.a(fhm.e)), 0.5F);
   }

   public aer a(bvr $$0) {
      return a.get($$0.fZ());
   }
}
