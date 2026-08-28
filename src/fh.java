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

public class fh<T> implements ArgumentType<je.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wy.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final alf<? extends jr<T>> e;
   private final jg<T> f;

   public fh(ee $$0, alf<? extends jr<T>> $$1) {
      this.e = $$1;
      this.f = $$0.e($$1);
   }

   public static <T> fh<T> a(ee $$0, alf<? extends jr<T>> $$1) {
      return new fh<>($$0, $$1);
   }

   public static <T> je.c<T> a(CommandContext<ei> $$0, String $$1, alf<jr<T>> $$2) throws CommandSyntaxException {
      je.c<T> $$3 = (je.c<T>)$$0.getArgument($$1, je.c.class);
      alf<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static je.c<byf> a(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mg.c);
   }

   public static je.c<eiy<?, ?>> b(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mg.aL);
   }

   public static je.c<erb> c(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mg.be);
   }

   public static je.c<bwo<?>> d(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mg.B);
   }

   public static je.c<bwo<?>> e(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      je.c<bwo<?>> $$2 = a($$0, $$1, mg.B);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static je.c<bvh> f(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mg.W);
   }

   public static je.c<dfq> g(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mg.aR);
   }

   public je.c<T> a(StringReader $$0) throws CommandSyntaxException {
      alg $$1 = alg.a($$0);
      alf<T> $$2 = alf.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return en.a(this.f.c_().map(alf::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements ie<fh<T>, fh.a<T>.a> {
      public void a(fh.a<T>.a $$0, vu $$1) {
         $$1.b($$0.b);
      }

      public fh.a<T>.a a(vu $$0) {
         return new fh.a.a($$0.r());
      }

      public void a(fh.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fh.a<T>.a a(fh<T> $$0) {
         return new fh.a.a($$0.e);
      }

      public final class a implements ie.a<fh<T>> {
         final alf<? extends jr<T>> b;

         a(final alf<? extends jr<T>> $$1) {
            this.b = $$1;
         }

         public fh<T> a(ee $$0) {
            return new fh<>($$0, this.b);
         }

         @Override
         public ie<fh<T>, ?> a() {
            return a.this;
         }
      }
   }
}
