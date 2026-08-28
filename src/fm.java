import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fm extends gg<edj.a> {
   private static final Codec<edj.a> a = baq.a(fm::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static edj.a[] b() {
      return Arrays.stream(edj.a.values()).filter(edj.a::d).toArray(edj.a[]::new);
   }

   private fm() {
      super(a, fm::b);
   }

   public static fm a() {
      return new fm();
   }

   public static edj.a a(CommandContext<ew> $$0, String $$1) {
      return (edj.a)$$0.getArgument($$1, edj.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
