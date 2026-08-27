import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class eu extends fo<dwv.a> {
   private static final Codec<dwv.a> a = ayz.a(eu::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dwv.a[] b() {
      return Arrays.stream(dwv.a.values()).filter(dwv.a::d).toArray(dwv.a[]::new);
   }

   private eu() {
      super(a, eu::b);
   }

   public static eu a() {
      return new eu();
   }

   public static dwv.a a(CommandContext<ee> $$0, String $$1) {
      return (dwv.a)$$0.getArgument($$1, dwv.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
