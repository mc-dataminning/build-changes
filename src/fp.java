import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class fp implements ArgumentType<xu> {
   private static final Collection<String> b = List.of("{\"bold\": true}\n");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wx.b("argument.style.invalid", $$0));
   private final iz.a c;

   private fp(iz.a $$0) {
      this.c = $$0;
   }

   public static xu a(CommandContext<ee> $$0, String $$1) {
      return (xu)$$0.getArgument($$1, xu.class);
   }

   public static fp a(ea $$0) {
      return new fp($$0);
   }

   public xu a(StringReader $$0) throws CommandSyntaxException {
      try {
         return ei.a(this.c, $$0, xu.b.b);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
