import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class fu implements ArgumentType<xv> {
   private static final Collection<String> b = List.of("{bold: true}", "{color: 'red'}", "{}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("argument.style.invalid", $$0));
   private final jg.a c;

   private fu(jg.a $$0) {
      this.c = $$0;
   }

   public static xv a(CommandContext<ei> $$0, String $$1) {
      return (xv)$$0.getArgument($$1, xv.class);
   }

   public static fu a(ee $$0) {
      return new fu($$0);
   }

   public xv a(StringReader $$0) throws CommandSyntaxException {
      return em.a(xv.b.b, this.c, a, $$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
