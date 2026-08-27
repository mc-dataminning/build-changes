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

public class ev implements ArgumentType<eia> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> te.a("argument.scoreboardDisplaySlot.invalid", $$0));

   private ev() {
   }

   public static ev a() {
      return new ev();
   }

   public static eia a(CommandContext<ds> $$0, String $$1) {
      return (eia)$$0.getArgument($$1, eia.class);
   }

   public eia a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      eia $$2 = eia.t.a($$1);
      if ($$2 == null) {
         throw a.create($$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dv.b(Arrays.stream(eia.values()).map(eia::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
