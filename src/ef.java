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

public class ef implements ArgumentType<csv> {
   private static final Collection<String> a = Stream.of(csv.a, csv.b).map(csv::b).collect(Collectors.toList());
   private static final csv[] b = csv.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vb.b("argument.gamemode.invalid", $$0));

   public csv a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      csv $$2 = csv.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dw ? dw.b(Arrays.stream(b).map(csv::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ef a() {
      return new ef();
   }

   public static csv a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return (csv)$$0.getArgument($$1, csv.class);
   }
}
