import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class et extends fn<dvz.a> {
   private static final Codec<dvz.a> a = ayt.a(et::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dvz.a[] b() {
      return Arrays.stream(dvz.a.values()).filter(dvz.a::d).toArray(dvz.a[]::new);
   }

   private et() {
      super(a, et::b);
   }

   public static et a() {
      return new et();
   }

   public static dvz.a a(CommandContext<ed> $$0, String $$1) {
      return (dvz.a)$$0.getArgument($$1, dvz.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
