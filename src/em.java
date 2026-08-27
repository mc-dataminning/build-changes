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

public class em implements ArgumentType<String> {
   private static final Collection<String> a = Arrays.asList("foo", "*", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vf.b("arguments.objective.notFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vf.b("arguments.objective.readonly", $$0));

   public static em a() {
      return new em();
   }

   public static emo a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      String $$2 = (String)$$0.getArgument($$1, String.class);
      emw $$3 = ((ds)$$0.getSource()).l().aH();
      emo $$4 = $$3.a($$2);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }

   public static emo b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      emo $$2 = a($$0, $$1);
      if ($$2.c().e()) {
         throw c.create($$2.b());
      } else {
         return $$2;
      }
   }

   public String a(StringReader $$0) throws CommandSyntaxException {
      return $$0.readUnquotedString();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      S $$2 = (S)$$0.getSource();
      if ($$2 instanceof ds $$3) {
         return dx.b($$3.l().aH().d(), $$1);
      } else {
         return $$2 instanceof dx $$4 ? $$4.a($$0) : Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return a;
   }
}
