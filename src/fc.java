import com.mojang.brigadier.context.CommandContext;
import java.util.Arrays;
import java.util.Collection;

public class fc extends bqj<uy> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");
   private static final bqe<uy> b = ut.a(un.a);

   private fc() {
      super(b);
   }

   public static fc a() {
      return new fc();
   }

   public static <S> uy a(CommandContext<S> $$0, String $$1) {
      return (uy)$$0.getArgument($$1, uy.class);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
