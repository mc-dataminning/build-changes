import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ei extends fa<doj.a> {
   private static final Codec<doj.a> a = ave.a(ei::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static doj.a[] b() {
      return Arrays.stream(doj.a.values()).filter(doj.a::d).toArray(doj.a[]::new);
   }

   private ei() {
      super(a, ei::b);
   }

   public static ei a() {
      return new ei();
   }

   public static doj.a a(CommandContext<ds> $$0, String $$1) {
      return (doj.a)$$0.getArgument($$1, doj.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
