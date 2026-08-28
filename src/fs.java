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

public class fs<T> implements ArgumentType<jn.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xd.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xd.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xd.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final ala<? extends ka<T>> e;
   private final jp<T> f;

   public fs(ep $$0, ala<? extends ka<T>> $$1) {
      this.e = $$1;
      this.f = $$0.b($$1);
   }

   public static <T> fs<T> a(ep $$0, ala<? extends ka<T>> $$1) {
      return new fs<>($$0, $$1);
   }

   public static <T> jn.c<T> a(CommandContext<et> $$0, String $$1, ala<ka<T>> $$2) throws CommandSyntaxException {
      jn.c<T> $$3 = (jn.c<T>)$$0.getArgument($$1, jn.c.class);
      ala<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static jn.c<bvh> a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lv.c);
   }

   public static jn.c<eco<?, ?>> b(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lv.aI);
   }

   public static jn.c<eko> c(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lv.aR);
   }

   public static jn.c<btq<?>> d(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lv.z);
   }

   public static jn.c<btq<?>> e(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      jn.c<btq<?>> $$2 = a($$0, $$1, lv.z);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static jn.c<bso> f(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lv.W);
   }

   public static jn.c<daw> g(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lv.aL);
   }

   public jn.c<T> a(StringReader $$0) throws CommandSyntaxException {
      alb $$1 = alb.a($$0);
      ala<T> $$2 = ala.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ey.a(this.f.c().map(ala::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements ip<fs<T>, fs.a<T>.a> {
      public void a(fs.a<T>.a $$0, wa $$1) {
         $$1.b($$0.b);
      }

      public fs.a<T>.a a(wa $$0) {
         return new fs.a.a($$0.r());
      }

      public void a(fs.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fs.a<T>.a a(fs<T> $$0) {
         return new fs.a.a($$0.e);
      }

      public final class a implements ip.a<fs<T>> {
         final ala<? extends ka<T>> b;

         a(final ala<? extends ka<T>> $$1) {
            this.b = $$1;
         }

         public fs<T> a(ep $$0) {
            return new fs<>($$0, this.b);
         }

         @Override
         public ip<fs<T>, ?> a() {
            return a.this;
         }
      }
   }
}
