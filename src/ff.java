import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ff extends fz<dxp.a> {
   private static final Codec<dxp.a> a = azp.a(ff::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dxp.a[] b() {
      return Arrays.stream(dxp.a.values()).filter(dxp.a::d).toArray(dxp.a[]::new);
   }

   private ff() {
      super(a, ff::b);
   }

   public static ff a() {
      return new ff();
   }

   public static dxp.a a(CommandContext<ep> $$0, String $$1) {
      return (dxp.a)$$0.getArgument($$1, dxp.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
