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

public class ef implements ArgumentType<cps> {
   private static final Collection<String> a = Stream.of(cps.a, cps.b).map(cps::b).collect(Collectors.toList());
   private static final cps[] b = cps.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tl.a("argument.gamemode.invalid", $$0));

   public cps a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      cps $$2 = cps.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dw ? dw.b(Arrays.stream(b).map(cps::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ef a() {
      return new ef();
   }

   public static cps a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return (cps)$$0.getArgument($$1, cps.class);
   }
}
