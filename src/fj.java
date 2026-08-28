import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fj extends gd<dzw.a> {
   private static final Codec<dzw.a> a = azy.a(fj::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dzw.a[] b() {
      return Arrays.stream(dzw.a.values()).filter(dzw.a::d).toArray(dzw.a[]::new);
   }

   private fj() {
      super(a, fj::b);
   }

   public static fj a() {
      return new fj();
   }

   public static dzw.a a(CommandContext<et> $$0, String $$1) {
      return (dzw.a)$$0.getArgument($$1, dzw.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
