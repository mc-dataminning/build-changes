import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fn extends gh<ect.a> {
   private static final Codec<ect.a> a = azv.a(fn::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static ect.a[] b() {
      return Arrays.stream(ect.a.values()).filter(ect.a::d).toArray(ect.a[]::new);
   }

   private fn() {
      super(a, fn::b);
   }

   public static fn a() {
      return new fn();
   }

   public static ect.a a(CommandContext<ex> $$0, String $$1) {
      return (ect.a)$$0.getArgument($$1, ect.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
