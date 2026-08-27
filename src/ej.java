import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ej extends fb<dmr.a> {
   private static final Codec<dmr.a> a = aug.a(ej::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dmr.a[] b() {
      return Arrays.stream(dmr.a.values()).filter(dmr.a::d).toArray(dmr.a[]::new);
   }

   private ej() {
      super(a, ej::b);
   }

   public static ej a() {
      return new ej();
   }

   public static dmr.a a(CommandContext<du> $$0, String $$1) {
      return (dmr.a)$$0.getArgument($$1, dmr.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
