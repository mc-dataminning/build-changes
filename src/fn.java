import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fn extends gh<ecr.a> {
   private static final Codec<ecr.a> a = azv.a(fn::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static ecr.a[] b() {
      return Arrays.stream(ecr.a.values()).filter(ecr.a::d).toArray(ecr.a[]::new);
   }

   private fn() {
      super(a, fn::b);
   }

   public static fn a() {
      return new fn();
   }

   public static ecr.a a(CommandContext<ex> $$0, String $$1) {
      return (ecr.a)$$0.getArgument($$1, ecr.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
