import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class eu extends fo<dwt.a> {
   private static final Codec<dwt.a> a = ayx.a(eu::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dwt.a[] b() {
      return Arrays.stream(dwt.a.values()).filter(dwt.a::d).toArray(dwt.a[]::new);
   }

   private eu() {
      super(a, eu::b);
   }

   public static eu a() {
      return new eu();
   }

   public static dwt.a a(CommandContext<ee> $$0, String $$1) {
      return (dwt.a)$$0.getArgument($$1, dwt.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
