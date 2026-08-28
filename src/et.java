import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

public class et extends bqu<xg> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "'hello world'", "\"\"", "{text:\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xg.b("argument.component.invalid", $$0));
   private static final DynamicOps<va> c = uo.a;
   private static final bqp<va> d = uu.a(c);

   private et(ji.a $$0) {
      super(d.a($$0.a(c), d, xi.a, a));
   }

   public static xg a(CommandContext<ek> $$0, String $$1) {
      return (xg)$$0.getArgument($$1, xg.class);
   }

   public static xg a(CommandContext<ek> $$0, String $$1, @Nullable bxe $$2) throws CommandSyntaxException {
      return xj.a((ek)$$0.getSource(), a($$0, $$1), $$2, 0);
   }

   public static xg b(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ek)$$0.getSource()).f());
   }

   public static et a(eg $$0) {
      return new et($$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
