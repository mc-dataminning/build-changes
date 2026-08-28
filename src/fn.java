import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fn extends gh<ecs.a> {
   private static final Codec<ecs.a> a = azv.a(fn::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static ecs.a[] b() {
      return Arrays.stream(ecs.a.values()).filter(ecs.a::d).toArray(ecs.a[]::new);
   }

   private fn() {
      super(a, fn::b);
   }

   public static fn a() {
      return new fn();
   }

   public static ecs.a a(CommandContext<ex> $$0, String $$1) {
      return (ecs.a)$$0.getArgument($$1, ecs.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
