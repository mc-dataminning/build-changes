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

public class fe implements ArgumentType<fgf> {
   private static final Collection<String> b = Arrays.asList("foo", "foo.bar.baz", "minecraft:foo");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("argument.criteria.invalid", $$0));

   private fe() {
   }

   public static fe a() {
      return new fe();
   }

   public static fgf a(CommandContext<ej> $$0, String $$1) {
      return (fgf)$$0.getArgument($$1, fgf.class);
   }

   public fgf a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();

      while ($$0.canRead() && $$0.peek() != ' ') {
         $$0.skip();
      }

      String $$2 = $$0.getString().substring($$1, $$0.getCursor());
      return fgf.a($$2).orElseThrow(() -> {
         $$0.setCursor($$1);
         return a.createWithContext($$0, $$2);
      });
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      List<String> $$2 = Lists.newArrayList(fgf.c());

      for (aww<?> $$3 : mg.v) {
         for (Object $$4 : $$3.b()) {
            String $$5 = this.a($$3, $$4);
            $$2.add($$5);
         }
      }

      return eo.b($$2, $$1);
   }

   public <T> String a(aww<T> $$0, Object $$1) {
      return awu.a($$0, (T)$$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
