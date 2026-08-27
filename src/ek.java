import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ek extends fc<dqv.a> {
   private static final Codec<dqv.a> a = axc.a(ek::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dqv.a[] b() {
      return Arrays.stream(dqv.a.values()).filter(dqv.a::d).toArray(dqv.a[]::new);
   }

   private ek() {
      super(a, ek::b);
   }

   public static ek a() {
      return new ek();
   }

   public static dqv.a a(CommandContext<du> $$0, String $$1) {
      return (dqv.a)$$0.getArgument($$1, dqv.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
