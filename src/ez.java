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

public class ez implements ArgumentType<String> {
   private static final Collection<String> a = Arrays.asList("foo", "123");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> te.a("team.notFound", $$0));

   public static ez a() {
      return new ez();
   }

   public static eic a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      String $$2 = (String)$$0.getArgument($$1, String.class);
      eie $$3 = ((ds)$$0.getSource()).l().aF();
      eic $$4 = $$3.d($$2);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }

   public String a(StringReader $$0) throws CommandSyntaxException {
      return $$0.readUnquotedString();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dv ? dv.b(((dv)$$0.getSource()).r(), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
