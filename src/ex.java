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

public class ex implements ArgumentType<dju> {
   private static final Collection<String> a = Stream.of(dju.a, dju.b).map(dju::b).collect(Collectors.toList());
   private static final dju[] b = dju.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xa.b("argument.gamemode.invalid", $$0));

   public dju a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      dju $$2 = dju.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eo ? eo.b(Arrays.stream(b).map(dju::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ex a() {
      return new ex();
   }

   public static dju a(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return (dju)$$0.getArgument($$1, dju.class);
   }
}
