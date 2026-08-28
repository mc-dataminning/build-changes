import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fm extends gg<ebf.a> {
   private static final Codec<ebf.a> a = bag.a(fm::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static ebf.a[] b() {
      return Arrays.stream(ebf.a.values()).filter(ebf.a::d).toArray(ebf.a[]::new);
   }

   private fm() {
      super(a, fm::b);
   }

   public static fm a() {
      return new fm();
   }

   public static ebf.a a(CommandContext<ew> $$0, String $$1) {
      return (ebf.a)$$0.getArgument($$1, ebf.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
