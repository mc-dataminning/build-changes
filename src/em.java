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

public class em implements ArgumentType<it> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> sw.a("particle.notFound", $$0));
   private final hg<iu<?>> c;

   public em(dm $$0) {
      this.c = $$0.a(jc.Q);
   }

   public static em a(dm $$0) {
      return new em($$0);
   }

   public static it a(CommandContext<ds> $$0, String $$1) {
      return (it)$$0.getArgument($$1, it.class);
   }

   public it a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static it a(StringReader $$0, hg<iu<?>> $$1) throws CommandSyntaxException {
      iu<?> $$2 = b($$0, $$1);
      return a($$0, (iu<it>)$$2);
   }

   private static iu<?> b(StringReader $$0, hg<iu<?>> $$1) throws CommandSyntaxException {
      acq $$2 = acq.a($$0);
      acp<iu<?>> $$3 = acp.a(jc.Q, $$2);
      return $$1.a($$3).orElseThrow(() -> a.create($$2)).a();
   }

   private static <T extends it> T a(StringReader $$0, iu<T> $$1) throws CommandSyntaxException {
      return $$1.d().b($$1, $$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return du.a(this.c.c().map(acp::a), $$1);
   }
}
