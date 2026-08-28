import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ff extends fz<dxw.a> {
   private static final Codec<dxw.a> a = azu.a(ff::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dxw.a[] b() {
      return Arrays.stream(dxw.a.values()).filter(dxw.a::d).toArray(dxw.a[]::new);
   }

   private ff() {
      super(a, ff::b);
   }

   public static ff a() {
      return new ff();
   }

   public static dxw.a a(CommandContext<ep> $$0, String $$1) {
      return (dxw.a)$$0.getArgument($$1, dxw.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
