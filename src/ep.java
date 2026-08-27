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

public class ep<T> implements ArgumentType<hf.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> te.a("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> te.a("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> te.a("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final aeo<? extends hs<T>> e;
   private final hh<T> f;

   public ep(dm $$0, aeo<? extends hs<T>> $$1) {
      this.e = $$1;
      this.f = $$0.a($$1);
   }

   public static <T> ep<T> a(dm $$0, aeo<? extends hs<T>> $$1) {
      return new ep<>($$0, $$1);
   }

   public static <T> hf.c<T> a(CommandContext<ds> $$0, String $$1, aeo<hs<T>> $$2) throws CommandSyntaxException {
      hf.c<T> $$3 = (hf.c<T>)$$0.getArgument($$1, hf.c.class);
      aeo<?> $$4 = $$3.g();
      if ($$4.b($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static hf.c<bjy> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jd.b);
   }

   public static hf.c<dmy<?, ?>> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jd.as);
   }

   public static hf.c<dux> c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jd.az);
   }

   public static hf.c<bik<?>> d(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jd.s);
   }

   public static hf.c<bik<?>> e(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      hf.c<bik<?>> $$2 = a($$0, $$1, jd.s);
      if (!$$2.a().c()) {
         throw d.create($$2.g().a().toString());
      } else {
         return $$2;
      }
   }

   public static hf.c<bhr> f(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jd.O);
   }

   public static hf.c<cnd> g(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jd.r);
   }

   public hf.c<T> a(StringReader $$0) throws CommandSyntaxException {
      aep $$1 = aep.a($$0);
      aeo<T> $$2 = aeo.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.create($$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dv.a(this.f.c().map(aeo::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements gh<ep<T>, ep.a<T>.a> {
      public void a(ep.a<T>.a $$0, sh $$1) {
         $$1.b($$0.b);
      }

      public ep.a<T>.a a(sh $$0) {
         return new ep.a.a($$0.t());
      }

      public void a(ep.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ep.a<T>.a a(ep<T> $$0) {
         return new ep.a.a($$0.e);
      }

      public final class a implements gh.a<ep<T>> {
         final aeo<? extends hs<T>> b;

         a(aeo<? extends hs<T>> $$1) {
            this.b = $$1;
         }

         public ep<T> a(dm $$0) {
            return new ep<>($$0, this.b);
         }

         @Override
         public gh<ep<T>, ?> a() {
            return a.this;
         }
      }
   }
}
