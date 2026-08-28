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

public class fd implements ArgumentType<dbw> {
   private static final Collection<String> a = Stream.of(dbw.a, dbw.b).map(dbw::b).collect(Collectors.toList());
   private static final dbw[] b = dbw.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xp.b("argument.gamemode.invalid", $$0));

   public dbw a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      dbw $$2 = dbw.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eu ? eu.b(Arrays.stream(b).map(dbw::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fd a() {
      return new fd();
   }

   public static dbw a(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return (dbw)$$0.getArgument($$1, dbw.class);
   }
}
