import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class ft implements ArgumentType<EnumSet<ih.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vu.c("arguments.swizzle.invalid"));

   public static ft a() {
      return new ft();
   }

   public static EnumSet<ih.a> a(CommandContext<du> $$0, String $$1) {
      return (EnumSet<ih.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<ih.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<ih.a> $$1 = EnumSet.noneOf(ih.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         ih.a $$6 = switch ($$2) {
            case 'x' -> ih.a.a;
            case 'y' -> ih.a.b;
            case 'z' -> ih.a.c;
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
