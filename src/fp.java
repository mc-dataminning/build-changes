import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class fp implements ArgumentType<EnumSet<ha.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tl.c("arguments.swizzle.invalid"));

   public static fp a() {
      return new fp();
   }

   public static EnumSet<ha.a> a(CommandContext<dt> $$0, String $$1) {
      return (EnumSet<ha.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<ha.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<ha.a> $$1 = EnumSet.noneOf(ha.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         ha.a $$6 = switch ($$2) {
            case 'x' -> ha.a.a;
            case 'y' -> ha.a.b;
            case 'z' -> ha.a.c;
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
