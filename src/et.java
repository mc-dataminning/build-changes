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

public class et<T> implements ArgumentType<il.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vs.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vs.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vs.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final ajb<? extends ix<T>> e;
   private final in<T> f;

   public et(dq $$0, ajb<? extends ix<T>> $$1) {
      this.e = $$1;
      this.f = $$0.b($$1);
   }

   public static <T> et<T> a(dq $$0, ajb<? extends ix<T>> $$1) {
      return new et<>($$0, $$1);
   }

   public static <T> il.c<T> a(CommandContext<du> $$0, String $$1, ajb<ix<T>> $$2) throws CommandSyntaxException {
      il.c<T> $$3 = (il.c<T>)$$0.getArgument($$1, il.c.class);
      ajb<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static il.c<bpz> a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ki.c);
   }

   public static il.c<duh<?, ?>> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ki.ax);
   }

   public static il.c<ecg> c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ki.aE);
   }

   public static il.c<bol<?>> d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ki.u);
   }

   public static il.c<bol<?>> e(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      il.c<bol<?>> $$2 = a($$0, $$1, ki.u);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static il.c<bnq> f(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ki.Q);
   }

   public static il.c<ctz> g(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ki.t);
   }

   public il.c<T> a(StringReader $$0) throws CommandSyntaxException {
      ajc $$1 = ajc.a($$0);
      ajb<T> $$2 = ajb.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.create($$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dz.a(this.f.c().map(ajb::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements hn<et<T>, et.a<T>.a> {
      public void a(et.a<T>.a $$0, us $$1) {
         $$1.b($$0.b);
      }

      public et.a<T>.a a(us $$0) {
         return new et.a.a($$0.r());
      }

      public void a(et.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public et.a<T>.a a(et<T> $$0) {
         return new et.a.a($$0.e);
      }

      public final class a implements hn.a<et<T>> {
         final ajb<? extends ix<T>> b;

         a(ajb<? extends ix<T>> $$1) {
            this.b = $$1;
         }

         public et<T> a(dq $$0) {
            return new et<>($$0, this.b);
         }

         @Override
         public hn<et<T>, ?> a() {
            return a.this;
         }
      }
   }
}
