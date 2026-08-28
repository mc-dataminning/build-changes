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

public class ex implements ArgumentType<dje> {
   private static final Collection<String> a = Stream.of(dje.a, dje.b).map(dje::b).collect(Collectors.toList());
   private static final dje[] b = dje.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("argument.gamemode.invalid", $$0));

   public dje a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      dje $$2 = dje.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eo ? eo.b(Arrays.stream(b).map(dje::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ex a() {
      return new ex();
   }

   public static dje a(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return (dje)$$0.getArgument($$1, dje.class);
   }
}
