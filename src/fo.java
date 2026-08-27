import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class fo implements ArgumentType<xr> {
   private static final Collection<String> b = List.of("{\"bold\": true}\n");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("argument.style.invalid", $$0));
   private final iy.a c;

   private fo(iy.a $$0) {
      this.c = $$0;
   }

   public static xr a(CommandContext<ed> $$0, String $$1) {
      return (xr)$$0.getArgument($$1, xr.class);
   }

   public static fo a(dz $$0) {
      return new fo($$0);
   }

   public xr a(StringReader $$0) throws CommandSyntaxException {
      try {
         return eh.a(this.c, $$0, xr.b.b);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
