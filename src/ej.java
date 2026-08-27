import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ej extends fb<dmf.a> {
   private static final Codec<dmf.a> a = aub.a(ej::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dmf.a[] b() {
      return Arrays.stream(dmf.a.values()).filter(dmf.a::d).toArray(dmf.a[]::new);
   }

   private ej() {
      super(a, ej::b);
   }

   public static ej a() {
      return new ej();
   }

   public static dmf.a a(CommandContext<du> $$0, String $$1) {
      return (dmf.a)$$0.getArgument($$1, dmf.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
