import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fm extends gg<ebq.a> {
   private static final Codec<ebq.a> a = bai.a(fm::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static ebq.a[] b() {
      return Arrays.stream(ebq.a.values()).filter(ebq.a::d).toArray(ebq.a[]::new);
   }

   private fm() {
      super(a, fm::b);
   }

   public static fm a() {
      return new fm();
   }

   public static ebq.a a(CommandContext<ew> $$0, String $$1) {
      return (ebq.a)$$0.getArgument($$1, ebq.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
