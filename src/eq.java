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

public class eq<T> implements ArgumentType<he.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tl.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> tl.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> tl.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final aey<? extends hq<T>> e;
   private final hg<T> f;

   public eq(dn $$0, aey<? extends hq<T>> $$1) {
      this.e = $$1;
      this.f = $$0.a($$1);
   }

   public static <T> eq<T> a(dn $$0, aey<? extends hq<T>> $$1) {
      return new eq<>($$0, $$1);
   }

   public static <T> he.c<T> a(CommandContext<dt> $$0, String $$1, aey<hq<T>> $$2) throws CommandSyntaxException {
      he.c<T> $$3 = (he.c<T>)$$0.getArgument($$1, he.c.class);
      aey<?> $$4 = $$3.g();
      if ($$4.b($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static he.c<bkn> a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.b);
   }

   public static he.c<dnd<?, ?>> b(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.at);
   }

   public static he.c<dvc> c(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.aA);
   }

   public static he.c<bja<?>> d(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.t);
   }

   public static he.c<bja<?>> e(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      he.c<bja<?>> $$2 = a($$0, $$1, jc.t);
      if (!$$2.a().c()) {
         throw d.create($$2.g().a().toString());
      } else {
         return $$2;
      }
   }

   public static he.c<bih> f(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.P);
   }

   public static he.c<cnu> g(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.s);
   }

   public he.c<T> a(StringReader $$0) throws CommandSyntaxException {
      aez $$1 = aez.a($$0);
      aey<T> $$2 = aey.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.create($$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dw.a(this.f.c().map(aey::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements gi<eq<T>, eq.a<T>.a> {
      public void a(eq.a<T>.a $$0, so $$1) {
         $$1.b($$0.b);
      }

      public eq.a<T>.a a(so $$0) {
         return new eq.a.a($$0.u());
      }

      public void a(eq.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public eq.a<T>.a a(eq<T> $$0) {
         return new eq.a.a($$0.e);
      }

      public final class a implements gi.a<eq<T>> {
         final aey<? extends hq<T>> b;

         a(aey<? extends hq<T>> $$1) {
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
