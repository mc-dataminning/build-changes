import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ff extends fz<dxv.a> {
   private static final Codec<dxv.a> a = azu.a(ff::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dxv.a[] b() {
      return Arrays.stream(dxv.a.values()).filter(dxv.a::d).toArray(dxv.a[]::new);
   }

   private ff() {
      super(a, ff::b);
   }

   public static ff a() {
      return new ff();
   }

   public static dxv.a a(CommandContext<ep> $$0, String $$1) {
      return (dxv.a)$$0.getArgument($$1, dxv.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
