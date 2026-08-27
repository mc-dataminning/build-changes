import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ek extends fc<dur.a> {
   private static final Codec<dur.a> a = aye.a(ek::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dur.a[] b() {
      return Arrays.stream(dur.a.values()).filter(dur.a::d).toArray(dur.a[]::new);
   }

   private ek() {
      super(a, ek::b);
   }

   public static ek a() {
      return new ek();
   }

   public static dur.a a(CommandContext<du> $$0, String $$1) {
      return (dur.a)$$0.getArgument($$1, dur.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
