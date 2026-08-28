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

public class fj<T> implements ArgumentType<jg.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xc.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xc.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xc.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final alj<? extends jt<T>> e;
   private final ji<T> f;

   public fj(eg $$0, alj<? extends jt<T>> $$1) {
      this.e = $$1;
      this.f = $$0.e($$1);
   }

   public static <T> fj<T> a(eg $$0, alj<? extends jt<T>> $$1) {
      return new fj<>($$0, $$1);
   }

   public static <T> jg.c<T> a(CommandContext<ek> $$0, String $$1, alj<jt<T>> $$2) throws CommandSyntaxException {
      jg.c<T> $$3 = (jg.c<T>)$$0.getArgument($$1, jg.c.class);
      alj<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static jg.c<byx> a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mi.c);
   }

   public static jg.c<ejx<?, ?>> b(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mi.aL);
   }

   public static jg.c<esd> c(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mi.be);
   }

   public static jg.c<bxe<?>> d(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mi.B);
   }

   public static jg.c<bxe<?>> e(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      jg.c<bxe<?>> $$2 = a($$0, $$1, mi.B);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static jg.c<bvx> f(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mi.W);
   }

   public static jg.c<dgn> g(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mi.aR);
   }

   public jg.c<T> a(StringReader $$0) throws CommandSyntaxException {
      alk $$1 = alk.a($$0);
      alj<T> $$2 = alj.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ep.a(this.f.c_().map(alj::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements ih<fj<T>, fj.a<T>.a> {
      public void a(fj.a<T>.a $$0, vy $$1) {
         $$1.b($$0.b);
      }

      public fj.a<T>.a a(vy $$0) {
         return new fj.a.a($$0.r());
      }

      public void a(fj.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fj.a<T>.a a(fj<T> $$0) {
         return new fj.a.a($$0.e);
      }

      public final class a implements ih.a<fj<T>> {
         final alj<? extends jt<T>> b;

         a(final alj<? extends jt<T>> $$1) {
            this.b = $$1;
         }

         public fj<T> a(eg $$0) {
            return new fj<>($$0, this.b);
         }

         @Override
         public ih<fj<T>, ?> a() {
            return a.this;
         }
      }
   }
}
