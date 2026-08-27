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

public class es implements ArgumentType<dau> {
   private static final Collection<String> a = Stream.of(dau.a, dau.b).map(dau::b).collect(Collectors.toList());
   private static final dau[] b = dau.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wx.b("argument.gamemode.invalid", $$0));

   public dau a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      dau $$2 = dau.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ej ? ej.b(Arrays.stream(b).map(dau::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static es a() {
      return new es();
   }

   public static dau a(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return (dau)$$0.getArgument($$1, dau.class);
   }
}
