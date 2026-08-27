import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class fj implements ArgumentType<fl> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(te.c("argument.pos.outofbounds"));

   public static fj a() {
      return new fj();
   }

   public static gv a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      aki $$2 = ((ds)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static gv a(CommandContext<ds> $$0, aki $$1, String $$2) throws CommandSyntaxException {
      gv $$3 = b($$0, $$2);
      if (!$$1.A($$3)) {
         throw a.create();
      } else if (!$$1.j($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static gv b(CommandContext<ds> $$0, String $$1) {
      return ((fl)$$0.getArgument($$1, fl.class)).c((ds)$$0.getSource());
   }

   public static gv c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      gv $$2 = b($$0, $$1);
      if (!cpk.k($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public fl a(StringReader $$0) throws CommandSyntaxException {
      return (fl)($$0.canRead() && $$0.peek() == '^' ? fm.a($$0) : fs.a($$0));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof dv)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<dv.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(dv.b.a);
         } else {
            $$3 = ((dv)$$0.getSource()).z();
         }

         return dv.a($$2, $$3, $$1, dt.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
