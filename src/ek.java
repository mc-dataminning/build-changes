import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ek implements ArgumentType<eig> {
   private static final Collection<String> b = Arrays.asList("foo", "foo.bar.baz", "minecraft:foo");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> tf.a("argument.criteria.invalid", $$0));

   private ek() {
   }

   public static ek a() {
      return new ek();
   }

   public static eig a(CommandContext<dr> $$0, String $$1) {
      return (eig)$$0.getArgument($$1, eig.class);
   }

   public eig a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();

      while ($$0.canRead() && $$0.peek() != ' ') {
         $$0.skip();
      }

      String $$2 = $$0.getString().substring($$1, $$0.getCursor());
      return eig.a($$2).orElseThrow(() -> {
         $$0.setCursor($$1);
         return a.create($$2);
      });
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      List<String> $$2 = Lists.newArrayList(eig.c());

      for (apf<?> $$3 : jb.y) {
         for (Object $$4 : $$3.a()) {
            String $$5 = this.a($$3, $$4);
            $$2.add($$5);
         }
      }

      return du.b($$2, $$1);
   }

   public <T> String a(apf<T> $$0, Object $$1) {
      return apd.a($$0, (T)$$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
