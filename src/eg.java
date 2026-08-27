import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class eg extends ey<dkh.a> {
   private static final Codec<dkh.a> a = asf.a(eg::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dkh.a[] b() {
      return Arrays.stream(dkh.a.values()).filter(dkh.a::d).toArray(dkh.a[]::new);
   }

   private eg() {
      super(a, eg::b);
   }

   public static eg a() {
      return new eg();
   }

   public static dkh.a a(CommandContext<ds> $$0, String $$1) {
      return (dkh.a)$$0.getArgument($$1, dkh.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
