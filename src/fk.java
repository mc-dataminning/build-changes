import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fk extends ge<eao.a> {
   private static final Codec<eao.a> a = bab.a(fk::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static eao.a[] b() {
      return Arrays.stream(eao.a.values()).filter(eao.a::d).toArray(eao.a[]::new);
   }

   private fk() {
      super(a, fk::b);
   }

   public static fk a() {
      return new fk();
   }

   public static eao.a a(CommandContext<eu> $$0, String $$1) {
      return (eao.a)$$0.getArgument($$1, eao.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
