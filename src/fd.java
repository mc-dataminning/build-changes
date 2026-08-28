import com.mojang.brigadier.context.CommandContext;
import java.util.Arrays;
import java.util.Collection;

public class fd extends bql<va> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");
   private static final bqg<va> b = uu.a(uo.a);

   private fd() {
      super(b);
   }

   public static fd a() {
      return new fd();
   }

   public static <S> va a(CommandContext<S> $$0, String $$1) {
      return (va)$$0.getArgument($$1, va.class);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
