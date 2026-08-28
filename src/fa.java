import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fa extends fv<ehp.a> {
   private static final Codec<ehp.a> a = bax.a(fa::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static ehp.a[] b() {
      return Arrays.stream(ehp.a.values()).filter(ehp.a::d).toArray(ehp.a[]::new);
   }

   private fa() {
      super(a, fa::b);
   }

   public static fa a() {
      return new fa();
   }

   public static ehp.a a(CommandContext<ek> $$0, String $$1) {
      return (ehp.a)$$0.getArgument($$1, ehp.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
