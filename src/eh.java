import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class eh extends ez<dku.a> {
   private static final Codec<dku.a> a = asr.a(eh::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dku.a[] b() {
      return Arrays.stream(dku.a.values()).filter(dku.a::d).toArray(dku.a[]::new);
   }

   private eh() {
      super(a, eh::b);
   }

   public static eh a() {
      return new eh();
   }

   public static dku.a a(CommandContext<dt> $$0, String $$1) {
      return (dku.a)$$0.getArgument($$1, dku.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
