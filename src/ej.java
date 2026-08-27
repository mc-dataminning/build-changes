import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ej extends fb<dmw.a> {
   private static final Codec<dmw.a> a = auk.a(ej::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dmw.a[] b() {
      return Arrays.stream(dmw.a.values()).filter(dmw.a::d).toArray(dmw.a[]::new);
   }

   private ej() {
      super(a, ej::b);
   }

   public static ej a() {
      return new ej();
   }

   public static dmw.a a(CommandContext<du> $$0, String $$1) {
      return (dmw.a)$$0.getArgument($$1, dmw.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
