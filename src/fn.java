import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fn extends gi<eel.a> {
   private static final Codec<eel.a> a = bag.a(fn::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static eel.a[] b() {
      return Arrays.stream(eel.a.values()).filter(eel.a::d).toArray(eel.a[]::new);
   }

   private fn() {
      super(a, fn::b);
   }

   public static fn a() {
      return new fn();
   }

   public static eel.a a(CommandContext<ex> $$0, String $$1) {
      return (eel.a)$$0.getArgument($$1, eel.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
