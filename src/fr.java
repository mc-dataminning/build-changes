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

public class fr implements ArgumentType<fgy> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xg.b("argument.scoreboardDisplaySlot.invalid", $$0));

   private fr() {
   }

   public static fr a() {
      return new fr();
   }

   public static fgy a(CommandContext<ek> $$0, String $$1) {
      return (fgy)$$0.getArgument($$1, fgy.class);
   }

   public fgy a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      fgy $$2 = fgy.t.a($$1);
      if ($$2 == null) {
         throw a.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ep.b(Arrays.stream(fgy.values()).map(fgy::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
