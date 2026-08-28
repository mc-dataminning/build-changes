import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fg extends ga<dyg.a> {
   private static final Codec<dyg.a> a = azc.a(fg::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dyg.a[] b() {
      return Arrays.stream(dyg.a.values()).filter(dyg.a::d).toArray(dyg.a[]::new);
   }

   private fg() {
      super(a, fg::b);
   }

   public static fg a() {
      return new fg();
   }

   public static dyg.a a(CommandContext<eq> $$0, String $$1) {
      return (dyg.a)$$0.getArgument($$1, dyg.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
