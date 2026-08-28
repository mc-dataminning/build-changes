import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fg implements ArgumentType<wp> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "'hello world'", "\"\"", "{text:\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wp.b("argument.component.invalid", $$0));
   private final jt.a c;

   private fg(jt.a $$0) {
      this.c = $$0;
   }

   public static wp a(CommandContext<ex> $$0, String $$1) {
      return (wp)$$0.getArgument($$1, wp.class);
   }

   public static fg a(et $$0) {
      return new fg($$0);
   }

   public wp a(StringReader $$0) throws CommandSyntaxException {
      return fb.a(wr.a, this.c, a, $$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
