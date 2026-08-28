import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ff extends fz<dxu.a> {
   private static final Codec<dxu.a> a = azu.a(ff::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dxu.a[] b() {
      return Arrays.stream(dxu.a.values()).filter(dxu.a::d).toArray(dxu.a[]::new);
   }

   private ff() {
      super(a, ff::b);
   }

   public static ff a() {
      return new ff();
   }

   public static dxu.a a(CommandContext<ep> $$0, String $$1) {
      return (dxu.a)$$0.getArgument($$1, dxu.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
