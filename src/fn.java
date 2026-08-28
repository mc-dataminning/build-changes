import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fn extends gh<edo.a> {
   private static final Codec<edo.a> a = azv.a(fn::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static edo.a[] b() {
      return Arrays.stream(edo.a.values()).filter(edo.a::d).toArray(edo.a[]::new);
   }

   private fn() {
      super(a, fn::b);
   }

   public static fn a() {
      return new fn();
   }

   public static edo.a a(CommandContext<ex> $$0, String $$1) {
      return (edo.a)$$0.getArgument($$1, edo.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
