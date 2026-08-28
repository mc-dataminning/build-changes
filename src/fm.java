import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fm extends gg<edi.a> {
   private static final Codec<edi.a> a = bba.a(fm::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static edi.a[] b() {
      return Arrays.stream(edi.a.values()).filter(edi.a::d).toArray(edi.a[]::new);
   }

   private fm() {
      super(a, fm::b);
   }

   public static fm a() {
      return new fm();
   }

   public static edi.a a(CommandContext<ew> $$0, String $$1) {
      return (edi.a)$$0.getArgument($$1, edi.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
