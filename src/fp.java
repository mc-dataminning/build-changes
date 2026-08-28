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

public class fp implements ArgumentType<fes> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ww.b("argument.scoreboardDisplaySlot.invalid", $$0));

   private fp() {
   }

   public static fp a() {
      return new fp();
   }

   public static fes a(CommandContext<ei> $$0, String $$1) {
      return (fes)$$0.getArgument($$1, fes.class);
   }

   public fes a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      fes $$2 = fes.t.a($$1);
      if ($$2 == null) {
         throw a.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return en.b(Arrays.stream(fes.values()).map(fes::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
