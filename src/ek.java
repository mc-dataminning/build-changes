import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ek extends fc<drq.a> {
   private static final Codec<drq.a> a = axg.a(ek::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static drq.a[] b() {
      return Arrays.stream(drq.a.values()).filter(drq.a::d).toArray(drq.a[]::new);
   }

   private ek() {
      super(a, ek::b);
   }

   public static ek a() {
      return new ek();
   }

   public static drq.a a(CommandContext<du> $$0, String $$1) {
      return (drq.a)$$0.getArgument($$1, drq.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
