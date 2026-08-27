import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class es extends fl<dvq.a> {
   private static final Codec<dvq.a> a = ayq.a(es::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static dvq.a[] b() {
      return Arrays.stream(dvq.a.values()).filter(dvq.a::d).toArray(dvq.a[]::new);
   }

   private es() {
      super(a, es::b);
   }

   public static es a() {
      return new es();
   }

   public static dvq.a a(CommandContext<ec> $$0, String $$1) {
      return (dvq.a)$$0.getArgument($$1, dvq.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
