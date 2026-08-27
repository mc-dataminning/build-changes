import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class fm implements ArgumentType<xp> {
   private static final Collection<String> b = List.of("{\"bold\": true}\n");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ws.b("argument.style.invalid", $$0));
   private final ix.a c;

   private fm(ix.a $$0) {
      this.c = $$0;
   }

   public static xp a(CommandContext<ec> $$0, String $$1) {
      return (xp)$$0.getArgument($$1, xp.class);
   }

   public static fm a(dy $$0) {
      return new fm($$0);
   }

   public xp a(StringReader $$0) throws CommandSyntaxException {
      try {
         return eg.a(this.c, $$0, xp.b.b);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
