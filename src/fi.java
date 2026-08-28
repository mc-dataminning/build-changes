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

public class fi<T> implements ArgumentType<jf.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wy.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final alf<? extends js<T>> e;
   private final jh<T> f;

   public fi(ef $$0, alf<? extends js<T>> $$1) {
      this.e = $$1;
      this.f = $$0.e($$1);
   }

   public static <T> fi<T> a(ef $$0, alf<? extends js<T>> $$1) {
      return new fi<>($$0, $$1);
   }

   public static <T> jf.c<T> a(CommandContext<ej> $$0, String $$1, alf<js<T>> $$2) throws CommandSyntaxException {
      jf.c<T> $$3 = (jf.c<T>)$$0.getArgument($$1, jf.c.class);
      alf<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static jf.c<byk> a(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mh.c);
   }

   public static jf.c<ejf<?, ?>> b(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mh.aL);
   }

   public static jf.c<eri> c(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mh.be);
   }

   public static jf.c<bwr<?>> d(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mh.B);
   }

   public static jf.c<bwr<?>> e(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      jf.c<bwr<?>> $$2 = a($$0, $$1, mh.B);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static jf.c<bvk> f(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mh.W);
   }

   public static jf.c<dfx> g(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mh.aR);
   }

   public jf.c<T> a(StringReader $$0) throws CommandSyntaxException {
      alg $$1 = alg.a($$0);
      alf<T> $$2 = alf.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eo.a(this.f.c_().map(alf::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements ig<fi<T>, fi.a<T>.a> {
      public void a(fi.a<T>.a $$0, vu $$1) {
         $$1.b($$0.b);
      }

      public fi.a<T>.a a(vu $$0) {
         return new fi.a.a($$0.r());
      }

      public void a(fi.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fi.a<T>.a a(fi<T> $$0) {
         return new fi.a.a($$0.e);
      }

      public final class a implements ig.a<fi<T>> {
         final alf<? extends js<T>> b;

         a(final alf<? extends js<T>> $$1) {
            this.b = $$1;
         }

         public fi<T> a(ef $$0) {
            return new fi<>($$0, this.b);
         }

         @Override
         public ig<fi<T>, ?> a() {
            return a.this;
         }
      }
   }
}
