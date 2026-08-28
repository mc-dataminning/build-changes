import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fm extends gg<edq.a> {
   private static final Codec<edq.a> a = bba.a(fm::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static edq.a[] b() {
      return Arrays.stream(edq.a.values()).filter(edq.a::d).toArray(edq.a[]::new);
   }

   private fm() {
      super(a, fm::b);
   }

   public static fm a() {
      return new fm();
   }

   public static edq.a a(CommandContext<ew> $$0, String $$1) {
      return (edq.a)$$0.getArgument($$1, edq.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
