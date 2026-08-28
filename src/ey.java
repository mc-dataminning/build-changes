import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ey extends ft<egg.a> {
   private static final Codec<egg.a> a = bak.a(ey::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static egg.a[] b() {
      return Arrays.stream(egg.a.values()).filter(egg.a::d).toArray(egg.a[]::new);
   }

   private ey() {
      super(a, ey::b);
   }

   public static ey a() {
      return new ey();
   }

   public static egg.a a(CommandContext<ei> $$0, String $$1) {
      return (egg.a)$$0.getArgument($$1, egg.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
