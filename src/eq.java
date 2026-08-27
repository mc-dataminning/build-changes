import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class eq<T> implements ArgumentType<hg.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tn.a("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> tn.a("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> tn.a("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final aex<? extends ht<T>> e;
   private final hi<T> f;

   public eq(dn $$0, aex<? extends ht<T>> $$1) {
      this.e = $$1;
      this.f = $$0.a($$1);
   }

   public static <T> eq<T> a(dn $$0, aex<? extends ht<T>> $$1) {
      return new eq<>($$0, $$1);
   }

   public static <T> hg.c<T> a(CommandContext<dt> $$0, String $$1, aex<ht<T>> $$2) throws CommandSyntaxException {
      hg.c<T> $$3 = (hg.c<T>)$$0.getArgument($$1, hg.c.class);
      aex<?> $$4 = $$3.g();
      if ($$4.b($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static hg.c<bkj> a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, je.b);
   }

   public static hg.c<dnl<?, ?>> b(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, je.as);
   }

   public static hg.c<dvk> c(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, je.az);
   }

   public static hg.c<biw<?>> d(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, je.s);
   }

   public static hg.c<biw<?>> e(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      hg.c<biw<?>> $$2 = a($$0, $$1, je.s);
      if (!$$2.a().c()) {
         throw d.create($$2.g().a().toString());
      } else {
         return $$2;
      }
   }

   public static hg.c<bid> f(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, je.O);
   }

   public static hg.c<cnq> g(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, je.r);
   }

   public hg.c<T> a(StringReader $$0) throws CommandSyntaxException {
      aey $$1 = aey.a($$0);
      aex<T> $$2 = aex.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.create($$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dw.a(this.f.c().map(aex::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements gi<eq<T>, eq.a<T>.a> {
      public void a(eq.a<T>.a $$0, sq $$1) {
         $$1.b($$0.b);
      }

      public eq.a<T>.a a(sq $$0) {
         return new eq.a.a($$0.t());
      }

      public void a(eq.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public eq.a<T>.a a(eq<T> $$0) {
         return new eq.a.a($$0.e);
      }

      public final class a implements gi.a<eq<T>> {
         final aex<? extends ht<T>> b;

         a(aex<? extends ht<T>> $$1) {
            this.b = $$1;
         }

         public eq<T> a(dn $$0) {
            return new eq<>($$0, this.b);
         }

         @Override
         public gi<eq<T>, ?> a() {
            return a.this;
         }
      }
   }
}
