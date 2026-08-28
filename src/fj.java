import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fj extends gd<dyv.a> {
   private static final Codec<dyv.a> a = azj.a(fj::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dyv.a[] b() {
      return Arrays.stream(dyv.a.values()).filter(dyv.a::d).toArray(dyv.a[]::new);
   }

   private fj() {
      super(a, fj::b);
   }

   public static fj a() {
      return new fj();
   }

   public static dyv.a a(CommandContext<et> $$0, String $$1) {
      return (dyv.a)$$0.getArgument($$1, dyv.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
