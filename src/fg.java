import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fg extends ga<dyf.a> {
   private static final Codec<dyf.a> a = azc.a(fg::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dyf.a[] b() {
      return Arrays.stream(dyf.a.values()).filter(dyf.a::d).toArray(dyf.a[]::new);
   }

   private fg() {
      super(a, fg::b);
   }

   public static fg a() {
      return new fg();
   }

   public static dyf.a a(CommandContext<eq> $$0, String $$1) {
      return (dyf.a)$$0.getArgument($$1, dyf.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
