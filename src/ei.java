import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ei extends fa<dop.a> {
   private static final Codec<dop.a> a = avj.a(ei::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dop.a[] b() {
      return Arrays.stream(dop.a.values()).filter(dop.a::d).toArray(dop.a[]::new);
   }

   private ei() {
      super(a, ei::b);
   }

   public static ei a() {
      return new ei();
   }

   public static dop.a a(CommandContext<ds> $$0, String $$1) {
      return (dop.a)$$0.getArgument($$1, dop.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
