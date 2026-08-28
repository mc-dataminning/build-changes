import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fn extends gh<ecq.a> {
   private static final Codec<ecq.a> a = azu.a(fn::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static ecq.a[] b() {
      return Arrays.stream(ecq.a.values()).filter(ecq.a::d).toArray(ecq.a[]::new);
   }

   private fn() {
      super(a, fn::b);
   }

   public static fn a() {
      return new fn();
   }

   public static ecq.a a(CommandContext<ex> $$0, String $$1) {
      return (ecq.a)$$0.getArgument($$1, ecq.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
