import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ez extends fu<ehd.a> {
   private static final Codec<ehd.a> a = bam.a(ez::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static ehd.a[] b() {
      return Arrays.stream(ehd.a.values()).filter(ehd.a::d).toArray(ehd.a[]::new);
   }

   private ez() {
      super(a, ez::b);
   }

   public static ez a() {
      return new ez();
   }

   public static ehd.a a(CommandContext<ej> $$0, String $$1) {
      return (ehd.a)$$0.getArgument($$1, ehd.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
