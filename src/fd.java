import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class fd implements ArgumentType<wn> {
   private static final Collection<String> b = List.of("{\"bold\": true}\n");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vq.b("argument.style.invalid", $$0));

   private fd() {
   }

   public static wn a(CommandContext<du> $$0, String $$1) {
      return (wn)$$0.getArgument($$1, wn.class);
   }

   public static fd a() {
      return new fd();
   }

   public wn a(StringReader $$0) throws CommandSyntaxException {
      try {
         return dy.a($$0, wn.b.b);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
