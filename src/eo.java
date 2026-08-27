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

public class eo implements ArgumentType<iv> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> tn.a("particle.notFound", $$0));
   private final hi<iw<?>> c;

   public eo(dn $$0) {
      this.c = $$0.a(je.Q);
   }

   public static eo a(dn $$0) {
      return new eo($$0);
   }

   public static iv a(CommandContext<dt> $$0, String $$1) {
      return (iv)$$0.getArgument($$1, iv.class);
   }

   public iv a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static iv a(StringReader $$0, hi<iw<?>> $$1) throws CommandSyntaxException {
      iw<?> $$2 = b($$0, $$1);
      return a($$0, (iw<iv>)$$2);
   }

   private static iw<?> b(StringReader $$0, hi<iw<?>> $$1) throws CommandSyntaxException {
      aey $$2 = aey.a($$0);
      aex<iw<?>> $$3 = aex.a(je.Q, $$2);
      return $$1.a($$3).orElseThrow(() -> a.create($$2)).a();
   }

   private static <T extends iv> T a(StringReader $$0, iw<T> $$1) throws CommandSyntaxException {
      return $$1.d().b($$1, $$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dw.a(this.c.c().map(aex::a), $$1);
   }
}
