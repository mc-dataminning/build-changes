import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ff extends fz<dxs.a> {
   private static final Codec<dxs.a> a = azs.a(ff::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dxs.a[] b() {
      return Arrays.stream(dxs.a.values()).filter(dxs.a::d).toArray(dxs.a[]::new);
   }

   private ff() {
      super(a, ff::b);
   }

   public static ff a() {
      return new ff();
   }

   public static dxs.a a(CommandContext<ep> $$0, String $$1) {
      return (dxs.a)$$0.getArgument($$1, dxs.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
