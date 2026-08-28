import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ez extends fu<egn.a> {
   private static final Codec<egn.a> a = bak.a(ez::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static egn.a[] b() {
      return Arrays.stream(egn.a.values()).filter(egn.a::d).toArray(egn.a[]::new);
   }

   private ez() {
      super(a, ez::b);
   }

   public static ez a() {
      return new ez();
   }

   public static egn.a a(CommandContext<ej> $$0, String $$1) {
      return (egn.a)$$0.getArgument($$1, egn.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
