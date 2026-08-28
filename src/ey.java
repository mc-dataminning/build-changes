import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ey extends ft<efn.a> {
   private static final Codec<efn.a> a = bai.a(ey::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static efn.a[] b() {
      return Arrays.stream(efn.a.values()).filter(efn.a::d).toArray(efn.a[]::new);
   }

   private ey() {
      super(a, ey::b);
   }

   public static ey a() {
      return new ey();
   }

   public static efn.a a(CommandContext<ei> $$0, String $$1) {
      return (efn.a)$$0.getArgument($$1, efn.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
