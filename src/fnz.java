import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fnz extends fqe<bss, faj<bss>> {
   private static final Map<bss.d, acq> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bss.d $$1 : bss.d.values()) {
         $$0.put($$1, new acq(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fnz(foy.a $$0) {
      super($$0, new faj<>($$0.a(fed.e)), 0.5F);
   }

   public acq a(bss $$0) {
      return a.get($$0.fY());
   }
}
