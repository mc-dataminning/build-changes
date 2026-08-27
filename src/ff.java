import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class ff implements ArgumentType<xf> {
   private static final Collection<String> b = List.of("{\"bold\": true}\n");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wi.b("argument.style.invalid", $$0));
   private final ip.a c;

   private ff(ip.a $$0) {
      this.c = $$0;
   }

   public static xf a(CommandContext<dv> $$0, String $$1) {
      return (xf)$$0.getArgument($$1, xf.class);
   }

   public static ff a(dr $$0) {
      return new ff($$0);
   }

   public xf a(StringReader $$0) throws CommandSyntaxException {
      try {
         return dz.a(this.c, $$0, xf.b.b);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
