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

public class er implements ArgumentType<jz> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vs.b("particle.notFound", $$0));
   private final in.a c;

   public er(dq $$0) {
      this.c = $$0;
   }

   public static er a(dq $$0) {
      return new er($$0);
   }

   public static jz a(CommandContext<du> $$0, String $$1) {
      return (jz)$$0.getArgument($$1, jz.class);
   }

   public jz a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static jz a(StringReader $$0, in.a $$1) throws CommandSyntaxException {
      ka<?> $$2 = a($$0, $$1.b(ki.S));
      return a($$0, (ka<jz>)$$2, $$1);
   }

   private static ka<?> a(StringReader $$0, in<ka<?>> $$1) throws CommandSyntaxException {
      ajc $$2 = ajc.a($$0);
      ajb<ka<?>> $$3 = ajb.a(ki.S, $$2);
      return $$1.a($$3).orElseThrow(() -> a.create($$2)).a();
   }

   private static <T extends jz> T a(StringReader $$0, ka<T> $$1, in.a $$2) throws CommandSyntaxException {
      return $$1.c().b($$1, $$0, $$2);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      in.b<ka<?>> $$2 = this.c.b(ki.S);
      return dz.a($$2.c().map(ajb::a), $$1);
   }
}
