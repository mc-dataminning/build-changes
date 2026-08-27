import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class ftf extends fvj<bxb, ffb<bxb>> {
   private static final Map<bxb.d, afw> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bxb.d $$1 : bxb.d.values()) {
         $$0.put($$1, new afw(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public ftf(fud.a $$0) {
      super($$0, new ffb<>($$0.a(fiv.e)), 0.5F);
   }

   public afw a(bxb $$0) {
      return a.get($$0.ge());
   }
}
