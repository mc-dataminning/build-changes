import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fj extends gd<eak.a> {
   private static final Codec<eak.a> a = azz.a(fj::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static eak.a[] b() {
      return Arrays.stream(eak.a.values()).filter(eak.a::d).toArray(eak.a[]::new);
   }

   private fj() {
      super(a, fj::b);
   }

   public static fj a() {
      return new fj();
   }

   public static eak.a a(CommandContext<et> $$0, String $$1) {
      return (eak.a)$$0.getArgument($$1, eak.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
