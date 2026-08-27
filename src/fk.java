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

public class fk implements ArgumentType<fm> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tl.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tl.c("argument.pos.outofbounds"));

   public static fk a() {
      return new fk();
   }

   public static gw a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      akq $$2 = ((dt)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static gw a(CommandContext<dt> $$0, akq $$1, String $$2) throws CommandSyntaxException {
      gw $$3 = b($$0, $$2);
      if (!$$1.A($$3)) {
         throw a.create();
      } else if (!$$1.j($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static gw b(CommandContext<dt> $$0, String $$1) {
      return ((fm)$$0.getArgument($$1, fm.class)).c((dt)$$0.getSource());
   }

   public static gw c(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      gw $$2 = b($$0, $$1);
      if (!cpv.k($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public fm a(StringReader $$0) throws CommandSyntaxException {
      return (fm)($$0.canRead() && $$0.peek() == '^' ? fn.a($$0) : ft.a($$0));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof dw)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<dw.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(dw.b.a);
         } else {
            $$3 = ((dw)$$0.getSource()).z();
         }

         return dw.a($$2, $$3, $$1, du.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
