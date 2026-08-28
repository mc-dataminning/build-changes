import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ff extends fz<dxt.a> {
   private static final Codec<dxt.a> a = azt.a(ff::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dxt.a[] b() {
      return Arrays.stream(dxt.a.values()).filter(dxt.a::d).toArray(dxt.a[]::new);
   }

   private ff() {
      super(a, ff::b);
   }

   public static ff a() {
      return new ff();
   }

   public static dxt.a a(CommandContext<ep> $$0, String $$1) {
      return (dxt.a)$$0.getArgument($$1, dxt.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
