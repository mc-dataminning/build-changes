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

public class fg<T> implements ArgumentType<ja.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xe.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final aks<? extends jn<T>> e;
   private final jc<T> f;

   public fg(ed $$0, aks<? extends jn<T>> $$1) {
      this.e = $$1;
      this.f = $$0.b($$1);
   }

   public static <T> fg<T> a(ed $$0, aks<? extends jn<T>> $$1) {
      return new fg<>($$0, $$1);
   }

   public static <T> ja.c<T> a(CommandContext<eh> $$0, String $$1, aks<jn<T>> $$2) throws CommandSyntaxException {
      ja.c<T> $$3 = (ja.c<T>)$$0.getArgument($$1, ja.c.class);
      aks<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static ja.c<btq> a(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, li.c);
   }

   public static ja.c<ebm<?, ?>> b(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, li.aC);
   }

   public static ja.c<ejt> c(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, li.aJ);
   }

   public static ja.c<bsb<?>> d(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, li.v);
   }

   public static ja.c<bsb<?>> e(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      ja.c<bsb<?>> $$2 = a($$0, $$1, li.v);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static ja.c<brf> f(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, li.R);
   }

   public static ja.c<dad> g(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, li.u);
   }

   public ja.c<T> a(StringReader $$0) throws CommandSyntaxException {
      akt $$1 = akt.a($$0);
      aks<T> $$2 = aks.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return em.a(this.f.c().map(aks::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements ib<fg<T>, fg.a<T>.a> {
      public void a(fg.a<T>.a $$0, we $$1) {
         $$1.b($$0.b);
      }

      public fg.a<T>.a a(we $$0) {
         return new fg.a.a($$0.r());
      }

      public void a(fg.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fg.a<T>.a a(fg<T> $$0) {
         return new fg.a.a($$0.e);
      }

      public final class a implements ib.a<fg<T>> {
         final aks<? extends jn<T>> b;

         a(aks<? extends jn<T>> $$1) {
            this.b = $$1;
         }

         public fg<T> a(ed $$0) {
            return new fg<>($$0, this.b);
         }

         @Override
         public ib<fg<T>, ?> a() {
            return a.this;
         }
      }
   }
}
