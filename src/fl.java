import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fl extends gf<eaz.a> {
   private static final Codec<eaz.a> a = baf.a(fl::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static eaz.a[] b() {
      return Arrays.stream(eaz.a.values()).filter(eaz.a::d).toArray(eaz.a[]::new);
   }

   private fl() {
      super(a, fl::b);
   }

   public static fl a() {
      return new fl();
   }

   public static eaz.a a(CommandContext<ev> $$0, String $$1) {
      return (eaz.a)$$0.getArgument($$1, eaz.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
