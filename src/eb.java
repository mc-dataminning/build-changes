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

public class eb implements ArgumentType<n> {
   private static final Collection<String> b = Arrays.asList("red", "green");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> uv.b("argument.color.invalid", $$0));

   private eb() {
   }

   public static eb a() {
      return new eb();
   }

   public static n a(CommandContext<du> $$0, String $$1) {
      return (n)$$0.getArgument($$1, n.class);
   }

   public n a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      n $$2 = n.b($$1);
      if ($$2 != null && !$$2.d()) {
         return $$2;
      } else {
         throw a.create($$1);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dy.b(n.a(true, false), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
