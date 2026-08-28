import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fj extends gd<dyy.a> {
   private static final Codec<dyy.a> a = azk.a(fj::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dyy.a[] b() {
      return Arrays.stream(dyy.a.values()).filter(dyy.a::d).toArray(dyy.a[]::new);
   }

   private fj() {
      super(a, fj::b);
   }

   public static fj a() {
      return new fj();
   }

   public static dyy.a a(CommandContext<et> $$0, String $$1) {
      return (dyy.a)$$0.getArgument($$1, dyy.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
