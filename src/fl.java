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

public class fl implements ArgumentType<dgw> {
   private static final Collection<String> a = Stream.of(dgw.a, dgw.b).map(dgw::b).collect(Collectors.toList());
   private static final dgw[] b = dgw.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wp.b("argument.gamemode.invalid", $$0));

   public dgw a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      dgw $$2 = dgw.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fc ? fc.b(Arrays.stream(b).map(dgw::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fl a() {
      return new fl();
   }

   public static dgw a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return (dgw)$$0.getArgument($$1, dgw.class);
   }
}
