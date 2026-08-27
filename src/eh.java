import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class eh extends ez<dkn.a> {
   private static final Codec<dkn.a> a = ask.a(eh::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dkn.a[] b() {
      return Arrays.stream(dkn.a.values()).filter(dkn.a::d).toArray(dkn.a[]::new);
   }

   private eh() {
      super(a, eh::b);
   }

   public static eh a() {
      return new eh();
   }

   public static dkn.a a(CommandContext<dt> $$0, String $$1) {
      return (dkn.a)$$0.getArgument($$1, dkn.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
