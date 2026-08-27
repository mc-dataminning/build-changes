import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ei extends fa<doy.a> {
   private static final Codec<doy.a> a = avl.a(ei::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static doy.a[] b() {
      return Arrays.stream(doy.a.values()).filter(doy.a::d).toArray(doy.a[]::new);
   }

   private ei() {
      super(a, ei::b);
   }

   public static ei a() {
      return new ei();
   }

   public static doy.a a(CommandContext<ds> $$0, String $$1) {
      return (doy.a)$$0.getArgument($$1, doy.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
