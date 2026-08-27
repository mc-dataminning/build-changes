import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ek extends fc<dsm.a> {
   private static final Codec<dsm.a> a = axq.a(ek::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dsm.a[] b() {
      return Arrays.stream(dsm.a.values()).filter(dsm.a::d).toArray(dsm.a[]::new);
   }

   private ek() {
      super(a, ek::b);
   }

   public static ek a() {
      return new ek();
   }

   public static dsm.a a(CommandContext<du> $$0, String $$1) {
      return (dsm.a)$$0.getArgument($$1, dsm.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
