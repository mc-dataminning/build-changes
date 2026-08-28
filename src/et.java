import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.JavaOps;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

public class et extends bql<xc> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "'hello world'", "\"\"", "{text:\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xc.b("argument.component.invalid", $$0));
   private static final bqg<Object> c = uu.a(JavaOps.INSTANCE);

   private et(ji.a $$0) {
      super(c.a($$0.a(JavaOps.INSTANCE), c, xe.a, a));
   }

   public static xc a(CommandContext<ek> $$0, String $$1) {
      return (xc)$$0.getArgument($$1, xc.class);
   }

   public static xc a(CommandContext<ek> $$0, String $$1, @Nullable bwv $$2) throws CommandSyntaxException {
      return xf.a((ek)$$0.getSource(), a($$0, $$1), $$2, 0);
   }

   public static xc b(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ek)$$0.getSource()).f());
   }

   public static et a(eg $$0) {
      return new et($$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
