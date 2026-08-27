import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ef extends ex<dkj.a> {
   private static final Codec<dkj.a> a = ash.a(ef::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dkj.a[] b() {
      return Arrays.stream(dkj.a.values()).filter(dkj.a::d).toArray(dkj.a[]::new);
   }

   private ef() {
      super(a, ef::b);
   }

   public static ef a() {
      return new ef();
   }

   public static dkj.a a(CommandContext<dr> $$0, String $$1) {
      return (dkj.a)$$0.getArgument($$1, dkj.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
