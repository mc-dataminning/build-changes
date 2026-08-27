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

public class er implements ArgumentType<ka> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vu.b("particle.notFound", $$0));
   private final in.a c;

   public er(dq $$0) {
      this.c = $$0;
   }

   public static er a(dq $$0) {
      return new er($$0);
   }

   public static ka a(CommandContext<du> $$0, String $$1) {
      return (ka)$$0.getArgument($$1, ka.class);
   }

   public ka a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static ka a(StringReader $$0, in.a $$1) throws CommandSyntaxException {
      kb<?> $$2 = a($$0, $$1.b(kj.S));
      return a($$0, (kb<ka>)$$2, $$1);
   }

   private static kb<?> a(StringReader $$0, in<kb<?>> $$1) throws CommandSyntaxException {
      ajh $$2 = ajh.a($$0);
      ajg<kb<?>> $$3 = ajg.a(kj.S, $$2);
      return $$1.a($$3).orElseThrow(() -> a.create($$2)).a();
   }

   private static <T extends ka> T a(StringReader $$0, kb<T> $$1, in.a $$2) throws CommandSyntaxException {
      return $$1.c().b($$1, $$0, $$2);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      in.b<kb<?>> $$2 = this.c.b(kj.S);
      return dz.a($$2.c().map(ajg::a), $$1);
   }
}
