import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class fb implements ArgumentType<wd> {
   private static final Collection<String> b = List.of("{\"bold\": true}\n");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vg.b("argument.style.invalid", $$0));

   private fb() {
   }

   public static wd a(CommandContext<ds> $$0, String $$1) {
      return (wd)$$0.getArgument($$1, wd.class);
   }

   public static fb a() {
      return new fb();
   }

   public wd a(StringReader $$0) throws CommandSyntaxException {
      try {
         return dw.a($$0, wd.b.b);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
