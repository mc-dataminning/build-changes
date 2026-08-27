import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ef extends ex<dki.a> {
   private static final Codec<dki.a> a = ash.a(ef::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dki.a[] b() {
      return Arrays.stream(dki.a.values()).filter(dki.a::d).toArray(dki.a[]::new);
   }

   private ef() {
      super(a, ef::b);
   }

   public static ef a() {
      return new ef();
   }

   public static dki.a a(CommandContext<dr> $$0, String $$1) {
      return (dki.a)$$0.getArgument($$1, dki.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
