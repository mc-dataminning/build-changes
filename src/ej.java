import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ej extends fb<dlk.a> {
   private static final Codec<dlk.a> a = atr.a(ej::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dlk.a[] b() {
      return Arrays.stream(dlk.a.values()).filter(dlk.a::d).toArray(dlk.a[]::new);
   }

   private ej() {
      super(a, ej::b);
   }

   public static ej a() {
      return new ej();
   }

   public static dlk.a a(CommandContext<du> $$0, String $$1) {
      return (dlk.a)$$0.getArgument($$1, dlk.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
