import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class fb implements ArgumentType<wa> {
   private static final Collection<String> b = List.of("{\"bold\": true}\n");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vd.b("argument.style.invalid", $$0));

   private fb() {
   }

   public static wa a(CommandContext<ds> $$0, String $$1) {
      return (wa)$$0.getArgument($$1, wa.class);
   }

   public static fb a() {
      return new fb();
   }

   public wa a(StringReader $$0) throws CommandSyntaxException {
      try {
         return dw.a($$0, wa.b.b);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
