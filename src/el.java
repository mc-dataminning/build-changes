import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class el extends fe<dva.a> {
   private static final Codec<dva.a> a = ayg.a(el::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dva.a[] b() {
      return Arrays.stream(dva.a.values()).filter(dva.a::d).toArray(dva.a[]::new);
   }

   private el() {
      super(a, el::b);
   }

   public static el a() {
      return new el();
   }

   public static dva.a a(CommandContext<dv> $$0, String $$1) {
      return (dva.a)$$0.getArgument($$1, dva.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
