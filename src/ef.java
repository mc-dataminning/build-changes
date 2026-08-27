import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class ef extends ex<dhk.a> {
   private static final Codec<dhk.a> a = apr.a(ef::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dhk.a[] b() {
      return Arrays.stream(dhk.a.values()).filter(dhk.a::d).toArray(dhk.a[]::new);
   }

   private ef() {
      super(a, ef::b);
   }

   public static ef a() {
      return new ef();
   }

   public static dhk.a a(CommandContext<ds> $$0, String $$1) {
      return (dhk.a)$$0.getArgument($$1, dhk.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
