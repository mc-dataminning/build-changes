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

public class fk implements ArgumentType<evh> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wx.b("argument.scoreboardDisplaySlot.invalid", $$0));

   private fk() {
   }

   public static fk a() {
      return new fk();
   }

   public static evh a(CommandContext<ee> $$0, String $$1) {
      return (evh)$$0.getArgument($$1, evh.class);
   }

   public evh a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      evh $$2 = evh.t.a($$1);
      if ($$2 == null) {
         throw a.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ej.b(Arrays.stream(evh.values()).map(evh::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
