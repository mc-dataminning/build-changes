import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fm extends gg<edp.a> {
   private static final Codec<edp.a> a = bba.a(fm::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static edp.a[] b() {
      return Arrays.stream(edp.a.values()).filter(edp.a::d).toArray(edp.a[]::new);
   }

   private fm() {
      super(a, fm::b);
   }

   public static fm a() {
      return new fm();
   }

   public static edp.a a(CommandContext<ew> $$0, String $$1) {
      return (edp.a)$$0.getArgument($$1, edp.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
