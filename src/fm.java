import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fm extends gg<ebj.a> {
   private static final Codec<ebj.a> a = baj.a(fm::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static ebj.a[] b() {
      return Arrays.stream(ebj.a.values()).filter(ebj.a::d).toArray(ebj.a[]::new);
   }

   private fm() {
      super(a, fm::b);
   }

   public static fm a() {
      return new fm();
   }

   public static ebj.a a(CommandContext<ew> $$0, String $$1) {
      return (ebj.a)$$0.getArgument($$1, ebj.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
