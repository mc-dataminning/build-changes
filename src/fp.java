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

public class fp<T> implements ArgumentType<jj.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wu.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wu.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final akj<? extends jw<T>> e;
   private final jl<T> f;

   public fp(em $$0, akj<? extends jw<T>> $$1) {
      this.e = $$1;
      this.f = $$0.b($$1);
   }

   public static <T> fp<T> a(em $$0, akj<? extends jw<T>> $$1) {
      return new fp<>($$0, $$1);
   }

   public static <T> jj.c<T> a(CommandContext<eq> $$0, String $$1, akj<jw<T>> $$2) throws CommandSyntaxException {
      jj.c<T> $$3 = (jj.c<T>)$$0.getArgument($$1, jj.c.class);
      akj<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static jj.c<buf> a(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lr.c);
   }

   public static jj.c<eay<?, ?>> b(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lr.aH);
   }

   public static jj.c<eix> c(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lr.aQ);
   }

   public static jj.c<bsn<?>> d(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lr.z);
   }

   public static jj.c<bsn<?>> e(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      jj.c<bsn<?>> $$2 = a($$0, $$1, lr.z);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static jj.c<brn> f(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lr.V);
   }

   public static jj.c<czm> g(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lr.aK);
   }

   public jj.c<T> a(StringReader $$0) throws CommandSyntaxException {
      akk $$1 = akk.a($$0);
      akj<T> $$2 = akj.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ev.a(this.f.c().map(akj::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements il<fp<T>, fp.a<T>.a> {
      public void a(fp.a<T>.a $$0, vr $$1) {
         $$1.b($$0.b);
      }

      public fp.a<T>.a a(vr $$0) {
         return new fp.a.a($$0.r());
      }

      public void a(fp.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fp.a<T>.a a(fp<T> $$0) {
         return new fp.a.a($$0.e);
      }

      public final class a implements il.a<fp<T>> {
         final akj<? extends jw<T>> b;

         a(final akj<? extends jw<T>> $$1) {
            this.b = $$1;
         }

         public fp<T> a(em $$0) {
            return new fp<>($$0, this.b);
         }

         @Override
         public il<fp<T>, ?> a() {
            return a.this;
         }
      }
   }
}
