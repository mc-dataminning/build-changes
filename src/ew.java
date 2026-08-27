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

public class ew implements ArgumentType<eid> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ti.a("argument.scoreboardDisplaySlot.invalid", $$0));

   private ew() {
   }

   public static ew a() {
      return new ew();
   }

   public static eid a(CommandContext<dt> $$0, String $$1) {
      return (eid)$$0.getArgument($$1, eid.class);
   }

   public eid a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      eid $$2 = eid.t.a($$1);
      if ($$2 == null) {
         throw a.create($$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dw.b(Arrays.stream(eid.values()).map(eid::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
