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
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eq implements ArgumentType<czr> {
   private static final Collection<String> a = Stream.of(czr.a, czr.b).map(czr::b).collect(Collectors.toList());
   private static final czr[] b = czr.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ws.b("argument.gamemode.invalid", $$0));

   public czr a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      czr $$2 = czr.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eh ? eh.b(Arrays.stream(b).map(czr::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static eq a() {
      return new eq();
   }

   public static czr a(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return (czr)$$0.getArgument($$1, czr.class);
   }
}
