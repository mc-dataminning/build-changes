import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fa extends fv<ehf.a> {
   private static final Codec<ehf.a> a = bao.a(fa::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static ehf.a[] b() {
      return Arrays.stream(ehf.a.values()).filter(ehf.a::d).toArray(ehf.a[]::new);
   }

   private fa() {
      super(a, fa::b);
   }

   public static fa a() {
      return new fa();
   }

   public static ehf.a a(CommandContext<ek> $$0, String $$1) {
      return (ehf.a)$$0.getArgument($$1, ehf.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
