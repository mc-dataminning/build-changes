import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class fo implements ArgumentType<EnumSet<hb.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("arguments.swizzle.invalid"));

   public static fo a() {
      return new fo();
   }

   public static EnumSet<hb.a> a(CommandContext<ds> $$0, String $$1) {
      return (EnumSet<hb.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<hb.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<hb.a> $$1 = EnumSet.noneOf(hb.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         hb.a $$6 = switch ($$2) {
            case 'x' -> hb.a.a;
            case 'y' -> hb.a.b;
            case 'z' -> hb.a.c;
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
