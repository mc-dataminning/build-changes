import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class fu implements ArgumentType<xt> {
   private static final Collection<String> b = List.of("{bold: true}", "{color: 'red'}", "{}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ww.b("argument.style.invalid", $$0));
   private final jg.a c;

   private fu(jg.a $$0) {
      this.c = $$0;
   }

   public static xt a(CommandContext<ei> $$0, String $$1) {
      return (xt)$$0.getArgument($$1, xt.class);
   }

   public static fu a(ee $$0) {
      return new fu($$0);
   }

   public xt a(StringReader $$0) throws CommandSyntaxException {
      return em.a(xt.b.b, this.c, a, $$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
