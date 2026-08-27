import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class fr implements ArgumentType<EnumSet<ic.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vg.c("arguments.swizzle.invalid"));

   public static fr a() {
      return new fr();
   }

   public static EnumSet<ic.a> a(CommandContext<ds> $$0, String $$1) {
      return (EnumSet<ic.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<ic.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<ic.a> $$1 = EnumSet.noneOf(ic.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         ic.a $$6 = switch ($$2) {
            case 'x' -> ic.a.a;
            case 'y' -> ic.a.b;
            case 'z' -> ic.a.c;
            default -> throw b.create();
         };
         if ($$1.contains($$6)) {
            throw b.create();
         }

         $$1.add($$6);
      }

      return $$1;
   }

   public Collection<String> getExamples() {
      return a;
   }
}
