import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ek extends fc<dso.a> {
   private static final Codec<dso.a> a = axq.a(ek::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dso.a[] b() {
      return Arrays.stream(dso.a.values()).filter(dso.a::d).toArray(dso.a[]::new);
   }

   private ek() {
      super(a, ek::b);
   }

   public static ek a() {
      return new ek();
   }

   public static dso.a a(CommandContext<du> $$0, String $$1) {
      return (dso.a)$$0.getArgument($$1, dso.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
