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

public class et<T> implements ArgumentType<ij.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vq.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vq.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vq.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final aix<? extends iv<T>> e;
   private final il<T> f;

   public et(dq $$0, aix<? extends iv<T>> $$1) {
      this.e = $$1;
      this.f = $$0.a($$1);
   }

   public static <T> et<T> a(dq $$0, aix<? extends iv<T>> $$1) {
      return new et<>($$0, $$1);
   }

   public static <T> ij.c<T> a(CommandContext<du> $$0, String $$1, aix<iv<T>> $$2) throws CommandSyntaxException {
      ij.c<T> $$3 = (ij.c<T>)$$0.getArgument($$1, ij.c.class);
      aix<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static ij.c<bpk> a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kg.c);
   }

   public static ij.c<dtm<?, ?>> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kg.aw);
   }

   public static ij.c<ebl> c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kg.aD);
   }

   public static ij.c<bnw<?>> d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kg.u);
   }

   public static ij.c<bnw<?>> e(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ij.c<bnw<?>> $$2 = a($$0, $$1, kg.u);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static ij.c<bnb> f(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kg.Q);
   }

   public static ij.c<ctm> g(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kg.t);
   }

   public ij.c<T> a(StringReader $$0) throws CommandSyntaxException {
      aiy $$1 = aiy.a($$0);
      aix<T> $$2 = aix.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.create($$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dz.a(this.f.c().map(aix::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements hl<et<T>, et.a<T>.a> {
      public void a(et.a<T>.a $$0, uq $$1) {
         $$1.b($$0.b);
      }

      public et.a<T>.a a(uq $$0) {
         return new et.a.a($$0.t());
      }

      public void a(et.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public et.a<T>.a a(et<T> $$0) {
         return new et.a.a($$0.e);
      }

      public final class a implements hl.a<et<T>> {
         final aix<? extends iv<T>> b;

         a(aix<? extends iv<T>> $$1) {
            this.b = $$1;
         }

         public et<T> a(dq $$0) {
            return new et<>($$0, this.b);
         }

         @Override
         public hl<et<T>, ?> a() {
            return a.this;
         }
      }
   }
}
