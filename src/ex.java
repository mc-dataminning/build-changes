import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ex extends fr<dyu.a> {
   private static final Codec<dyu.a> a = azg.a(ex::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dyu.a[] b() {
      return Arrays.stream(dyu.a.values()).filter(dyu.a::d).toArray(dyu.a[]::new);
   }

   private ex() {
      super(a, ex::b);
   }

   public static ex a() {
      return new ex();
   }

   public static dyu.a a(CommandContext<eh> $$0, String $$1) {
      return (dyu.a)$$0.getArgument($$1, dyu.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
