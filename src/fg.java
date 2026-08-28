import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fg extends ga<dxz.a> {
   private static final Codec<dxz.a> a = ayz.a(fg::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dxz.a[] b() {
      return Arrays.stream(dxz.a.values()).filter(dxz.a::d).toArray(dxz.a[]::new);
   }

   private fg() {
      super(a, fg::b);
   }

   public static fg a() {
      return new fg();
   }

   public static dxz.a a(CommandContext<eq> $$0, String $$1) {
      return (dxz.a)$$0.getArgument($$1, dxz.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
