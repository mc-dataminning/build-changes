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

public class fe implements ArgumentType<kz> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("particle.notFound", $$0));
   private final jc.a c;

   public fe(ed $$0) {
      this.c = $$0;
   }

   public static fe a(ed $$0) {
      return new fe($$0);
   }

   public static kz a(CommandContext<eh> $$0, String $$1) {
      return (kz)$$0.getArgument($$1, kz.class);
   }

   public kz a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static kz a(StringReader $$0, jc.a $$1) throws CommandSyntaxException {
      la<?> $$2 = a($$0, $$1.b(li.T));
      return a($$0, (la<kz>)$$2, $$1);
   }

   private static la<?> a(StringReader $$0, jc<la<?>> $$1) throws CommandSyntaxException {
      akt $$2 = akt.a($$0);
      aks<la<?>> $$3 = aks.a(li.T, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends kz> T a(StringReader $$0, la<T> $$1, jc.a $$2) throws CommandSyntaxException {
      return $$1.c().b($$1, $$0, $$2);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      jc.b<la<?>> $$2 = this.c.b(li.T);
      return em.a($$2.c().map(aks::a), $$1);
   }
}
