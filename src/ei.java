import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ei extends fa<doq.a> {
   private static final Codec<doq.a> a = avk.a(ei::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static doq.a[] b() {
      return Arrays.stream(doq.a.values()).filter(doq.a::d).toArray(doq.a[]::new);
   }

   private ei() {
      super(a, ei::b);
   }

   public static ei a() {
      return new ei();
   }

   public static doq.a a(CommandContext<ds> $$0, String $$1) {
      return (doq.a)$$0.getArgument($$1, doq.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
