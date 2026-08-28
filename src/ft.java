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

public class ft<T> implements ArgumentType<jo.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xe.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final ald<? extends kb<T>> e;
   private final jq<T> f;

   public ft(eq $$0, ald<? extends kb<T>> $$1) {
      this.e = $$1;
      this.f = $$0.d($$1);
   }

   public static <T> ft<T> a(eq $$0, ald<? extends kb<T>> $$1) {
      return new ft<>($$0, $$1);
   }

   public static <T> jo.c<T> a(CommandContext<eu> $$0, String $$1, ald<kb<T>> $$2) throws CommandSyntaxException {
      jo.c<T> $$3 = (jo.c<T>)$$0.getArgument($$1, jo.c.class);
      ald<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static jo.c<bvp> a(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lw.c);
   }

   public static jo.c<edg<?, ?>> b(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lw.aK);
   }

   public static jo.c<elg> c(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lw.aT);
   }

   public static jo.c<bty<?>> d(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lw.z);
   }

   public static jo.c<bty<?>> e(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      jo.c<bty<?>> $$2 = a($$0, $$1, lw.z);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static jo.c<bsw> f(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lw.W);
   }

   public static jo.c<dbn> g(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lw.aN);
   }

   public jo.c<T> a(StringReader $$0) throws CommandSyntaxException {
      ale $$1 = ale.a($$0);
      ald<T> $$2 = ald.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ez.a(this.f.c_().map(ald::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements iq<ft<T>, ft.a<T>.a> {
      public void a(ft.a<T>.a $$0, wb $$1) {
         $$1.b($$0.b);
      }

      public ft.a<T>.a a(wb $$0) {
         return new ft.a.a($$0.r());
      }

      public void a(ft.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ft.a<T>.a a(ft<T> $$0) {
         return new ft.a.a($$0.e);
      }

      public final class a implements iq.a<ft<T>> {
         final ald<? extends kb<T>> b;

         a(final ald<? extends kb<T>> $$1) {
            this.b = $$1;
         }

         public ft<T> a(eq $$0) {
            return new ft<>($$0, this.b);
         }

         @Override
         public iq<ft<T>, ?> a() {
            return a.this;
         }
      }
   }
}
