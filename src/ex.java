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

public class ex implements ArgumentType<emo> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vf.b("argument.scoreboardDisplaySlot.invalid", $$0));

   private ex() {
   }

   public static ex a() {
      return new ex();
   }

   public static emo a(CommandContext<ds> $$0, String $$1) {
      return (emo)$$0.getArgument($$1, emo.class);
   }

   public emo a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      emo $$2 = emo.t.a($$1);
      if ($$2 == null) {
         throw a.create($$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dx.b(Arrays.stream(emo.values()).map(emo::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
