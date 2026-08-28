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

public class fl implements ArgumentType<dgg> {
   private static final Collection<String> a = Stream.of(dgg.a, dgg.b).map(dgg::b).collect(Collectors.toList());
   private static final dgg[] b = dgg.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wp.b("argument.gamemode.invalid", $$0));

   public dgg a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      dgg $$2 = dgg.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fc ? fc.b(Arrays.stream(b).map(dgg::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fl a() {
      return new fl();
   }

   public static dgg a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return (dgg)$$0.getArgument($$1, dgg.class);
   }
}
