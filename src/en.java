import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class en implements ArgumentType<wx> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wx.b("argument.component.invalid", $$0));
   private final iz.a c;

   private en(iz.a $$0) {
      this.c = $$0;
   }

   public static wx a(CommandContext<ee> $$0, String $$1) {
      return (wx)$$0.getArgument($$1, wx.class);
   }

   public static en a(ea $$0) {
      return new en($$0);
   }

   public wx a(StringReader $$0) throws CommandSyntaxException {
      try {
         return ei.a(this.c, $$0, wz.a);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
