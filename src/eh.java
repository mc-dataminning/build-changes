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

public class eh implements ArgumentType<cqw> {
   private static final Collection<String> a = Stream.of(cqw.a, cqw.b).map(cqw::b).collect(Collectors.toList());
   private static final cqw[] b = cqw.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ui.b("argument.gamemode.invalid", $$0));

   public cqw a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      cqw $$2 = cqw.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dy ? dy.b(Arrays.stream(b).map(cqw::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static eh a() {
      return new eh();
   }

   public static cqw a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return (cqw)$$0.getArgument($$1, cqw.class);
   }
}
