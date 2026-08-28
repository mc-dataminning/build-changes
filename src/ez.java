import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ez extends fu<egs.a> {
   private static final Codec<egs.a> a = bak.a(ez::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static egs.a[] b() {
      return Arrays.stream(egs.a.values()).filter(egs.a::d).toArray(egs.a[]::new);
   }

   private ez() {
      super(a, ez::b);
   }

   public static ez a() {
      return new ez();
   }

   public static egs.a a(CommandContext<ej> $$0, String $$1) {
      return (egs.a)$$0.getArgument($$1, egs.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
