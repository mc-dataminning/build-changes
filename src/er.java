import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class er implements ArgumentType<o> {
   private static final Collection<String> b = Arrays.asList("red", "green");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("argument.color.invalid", $$0));

   private er() {
   }

   public static er a() {
      return new er();
   }

   public static o a(CommandContext<ej> $$0, String $$1) {
      return (o)$$0.getArgument($$1, o.class);
   }

   public o a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      o $$2 = o.b($$1);
      if ($$2 != null && !$$2.d()) {
         return $$2;
      } else {
         throw a.createWithContext($$0, $$1);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eo.b(o.a(true, false), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
