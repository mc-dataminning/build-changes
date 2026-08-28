import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ey extends ft<efy.a> {
   private static final Codec<efy.a> a = bak.a(ey::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static efy.a[] b() {
      return Arrays.stream(efy.a.values()).filter(efy.a::d).toArray(efy.a[]::new);
   }

   private ey() {
      super(a, ey::b);
   }

   public static ey a() {
      return new ey();
   }

   public static efy.a a(CommandContext<ei> $$0, String $$1) {
      return (efy.a)$$0.getArgument($$1, efy.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
