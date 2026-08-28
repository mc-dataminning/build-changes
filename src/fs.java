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

public class fs<T> implements ArgumentType<jm.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wz.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wz.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wz.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final akq<? extends jz<T>> e;
   private final jo<T> f;

   public fs(ep $$0, akq<? extends jz<T>> $$1) {
      this.e = $$1;
      this.f = $$0.b($$1);
   }

   public static <T> fs<T> a(ep $$0, akq<? extends jz<T>> $$1) {
      return new fs<>($$0, $$1);
   }

   public static <T> jm.c<T> a(CommandContext<et> $$0, String $$1, akq<jz<T>> $$2) throws CommandSyntaxException {
      jm.c<T> $$3 = (jm.c<T>)$$0.getArgument($$1, jm.c.class);
      akq<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static jm.c<bur> a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lu.c);
   }

   public static jm.c<ebq<?, ?>> b(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lu.aI);
   }

   public static jm.c<ejr> c(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lu.aR);
   }

   public static jm.c<bsx<?>> d(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lu.z);
   }

   public static jm.c<bsx<?>> e(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      jm.c<bsx<?>> $$2 = a($$0, $$1, lu.z);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static jm.c<brx> f(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lu.W);
   }

   public static jm.c<dac> g(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lu.aL);
   }

   public jm.c<T> a(StringReader $$0) throws CommandSyntaxException {
      akr $$1 = akr.a($$0);
      akq<T> $$2 = akq.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ey.a(this.f.c().map(akq::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements io<fs<T>, fs.a<T>.a> {
      public void a(fs.a<T>.a $$0, vw $$1) {
         $$1.b($$0.b);
      }

      public fs.a<T>.a a(vw $$0) {
         return new fs.a.a($$0.r());
      }

      public void a(fs.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fs.a<T>.a a(fs<T> $$0) {
         return new fs.a.a($$0.e);
      }

      public final class a implements io.a<fs<T>> {
         final akq<? extends jz<T>> b;

         a(final akq<? extends jz<T>> $$1) {
            this.b = $$1;
         }

         public fs<T> a(ep $$0) {
            return new fs<>($$0, this.b);
         }

         @Override
         public io<fs<T>, ?> a() {
            return a.this;
         }
      }
   }
}
