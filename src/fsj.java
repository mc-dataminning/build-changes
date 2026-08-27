import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fsj extends fun<bvy, feh<bvy>> {
   private static final Map<bvy.d, aex> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bvy.d $$1 : bvy.d.values()) {
         $$0.put($$1, new aex(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fsj(fth.a $$0) {
      super($$0, new feh<>($$0.a(fib.e)), 0.5F);
   }

   public aex a(bvy $$0) {
      return a.get($$0.gd());
   }
}
