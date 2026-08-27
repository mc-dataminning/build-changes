import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class ft implements ArgumentType<EnumSet<ie.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vq.c("arguments.swizzle.invalid"));

   public static ft a() {
      return new ft();
   }

   public static EnumSet<ie.a> a(CommandContext<du> $$0, String $$1) {
      return (EnumSet<ie.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<ie.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<ie.a> $$1 = EnumSet.noneOf(ie.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         ie.a $$6 = switch ($$2) {
            case 'x' -> ie.a.a;
            case 'y' -> ie.a.b;
            case 'z' -> ie.a.c;
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
