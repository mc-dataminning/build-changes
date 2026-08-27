import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class eh extends ez<dny.a> {
   private static final Codec<dny.a> a = aut.a(eh::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dny.a[] b() {
      return Arrays.stream(dny.a.values()).filter(dny.a::d).toArray(dny.a[]::new);
   }

   private eh() {
      super(a, eh::b);
   }

   public static eh a() {
      return new eh();
   }

   public static dny.a a(CommandContext<ds> $$0, String $$1) {
      return (dny.a)$$0.getArgument($$1, dny.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
