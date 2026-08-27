import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class eh extends ez<dkm.a> {
   private static final Codec<dkm.a> a = asu.a(eh::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dkm.a[] b() {
      return Arrays.stream(dkm.a.values()).filter(dkm.a::d).toArray(dkm.a[]::new);
   }

   private eh() {
      super(a, eh::b);
   }

   public static eh a() {
      return new eh();
   }

   public static dkm.a a(CommandContext<dt> $$0, String $$1) {
      return (dkm.a)$$0.getArgument($$1, dkm.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
