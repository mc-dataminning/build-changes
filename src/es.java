import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.JavaOps;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

public class es extends bqj<xa> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "'hello world'", "\"\"", "{text:\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xa.b("argument.component.invalid", $$0));
   private static final bqe<Object> c = ut.a(JavaOps.INSTANCE);

   private es(jh.a $$0) {
      super(c.a($$0.a(JavaOps.INSTANCE), c, xc.a, a));
   }

   public static xa a(CommandContext<ej> $$0, String $$1) {
      return (xa)$$0.getArgument($$1, xa.class);
   }

   public static xa a(CommandContext<ej> $$0, String $$1, @Nullable bwt $$2) throws CommandSyntaxException {
      return xd.a((ej)$$0.getSource(), a($$0, $$1), $$2, 0);
   }

   public static xa b(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ej)$$0.getSource()).f());
   }

   public static es a(ef $$0) {
      return new es($$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
