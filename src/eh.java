import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class eh extends ez<dks.a> {
   private static final Codec<dks.a> a = asp.a(eh::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dks.a[] b() {
      return Arrays.stream(dks.a.values()).filter(dks.a::d).toArray(dks.a[]::new);
   }

   private eh() {
      super(a, eh::b);
   }

   public static eh a() {
      return new eh();
   }

   public static dks.a a(CommandContext<dt> $$0, String $$1) {
      return (dks.a)$$0.getArgument($$1, dks.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
