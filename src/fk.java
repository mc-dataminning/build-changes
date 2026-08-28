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

public class fk implements ArgumentType<dfc> {
   private static final Collection<String> a = Stream.of(dfc.a, dfc.b).map(dfc::b).collect(Collectors.toList());
   private static final dfc[] b = dfc.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xl.b("argument.gamemode.invalid", $$0));

   public dfc a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      dfc $$2 = dfc.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fb ? fb.b(Arrays.stream(b).map(dfc::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fk a() {
      return new fk();
   }

   public static dfc a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return (dfc)$$0.getArgument($$1, dfc.class);
   }
}
