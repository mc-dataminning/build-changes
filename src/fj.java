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

public class fj implements ArgumentType<des> {
   private static final Collection<String> a = Stream.of(des.a, des.b).map(des::b).collect(Collectors.toList());
   private static final des[] b = des.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xh.b("argument.gamemode.invalid", $$0));

   public des a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      des $$2 = des.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fa ? fa.b(Arrays.stream(b).map(des::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fj a() {
      return new fj();
   }

   public static des a(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return (des)$$0.getArgument($$1, des.class);
   }
}
