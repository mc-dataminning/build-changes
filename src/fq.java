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

public class fq implements ArgumentType<ffy> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("argument.scoreboardDisplaySlot.invalid", $$0));

   private fq() {
   }

   public static fq a() {
      return new fq();
   }

   public static ffy a(CommandContext<ej> $$0, String $$1) {
      return (ffy)$$0.getArgument($$1, ffy.class);
   }

   public ffy a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      ffy $$2 = ffy.t.a($$1);
      if ($$2 == null) {
         throw a.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eo.b(Arrays.stream(ffy.values()).map(ffy::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
