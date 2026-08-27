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
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tl.a("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> tl.a("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> tl.a("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final aev<? extends hq<T>> e;
   private final hg<T> f;

   public eq(dn $$0, aev<? extends hq<T>> $$1) {
      this.e = $$1;
      this.f = $$0.a($$1);
   }

   public static <T> eq<T> a(dn $$0, aev<? extends hq<T>> $$1) {
      return new eq<>($$0, $$1);
   }

   public static <T> he.c<T> a(CommandContext<dt> $$0, String $$1, aev<hq<T>> $$2) throws CommandSyntaxException {
      he.c<T> $$3 = (he.c<T>)$$0.getArgument($$1, he.c.class);
      aev<?> $$4 = $$3.g();
      if ($$4.b($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static he.c<bkh> a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.b);
   }

   public static he.c<dnj<?, ?>> b(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.as);
   }

   public static he.c<dvi> c(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.az);
   }

   public static he.c<biu<?>> d(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.s);
   }

   public static he.c<biu<?>> e(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      he.c<biu<?>> $$2 = a($$0, $$1, jc.s);
      if (!$$2.a().c()) {
         throw d.create($$2.g().a().toString());
      } else {
         return $$2;
      }
   }

   public static he.c<bib> f(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.O);
   }

   public static he.c<cno> g(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.r);
   }

   public he.c<T> a(StringReader $$0) throws CommandSyntaxException {
      aew $$1 = aew.a($$0);
      aev<T> $$2 = aev.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.create($$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dw.a(this.f.c().map(aev::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements gi<eq<T>, eq.a<T>.a> {
      public void a(eq.a<T>.a $$0, so $$1) {
         $$1.b($$0.b);
      }

      public eq.a<T>.a a(so $$0) {
         return new eq.a.a($$0.t());
      }

      public void a(eq.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public eq.a<T>.a a(eq<T> $$0) {
         return new eq.a.a($$0.e);
      }

      public final class a implements gi.a<eq<T>> {
         final aev<? extends hq<T>> b;

         a(aev<? extends hq<T>> $$1) {
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
