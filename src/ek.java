import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ek extends fc<dqo.a> {
   private static final Codec<dqo.a> a = axc.a(ek::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dqo.a[] b() {
      return Arrays.stream(dqo.a.values()).filter(dqo.a::d).toArray(dqo.a[]::new);
   }

   private ek() {
      super(a, ek::b);
   }

   public static ek a() {
      return new ek();
   }

   public static dqo.a a(CommandContext<du> $$0, String $$1) {
      return (dqo.a)$$0.getArgument($$1, dqo.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
