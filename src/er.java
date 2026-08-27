import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class er<T> implements ArgumentType<ags<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vb.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vb.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vb.b("commands.place.jigsaw.invalid", $$0));
   final ags<? extends ir<T>> e;

   public er(ags<? extends ir<T>> $$0) {
      this.e = $$0;
   }

   public static <T> er<T> a(ags<? extends ir<T>> $$0) {
      return new er<>($$0);
   }

   private static <T> ags<T> a(CommandContext<ds> $$0, String $$1, ags<ir<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ags<?> $$4 = (ags<?>)$$0.getArgument($$1, ags.class);
      Optional<ags<T>> $$5 = $$4.c($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> ir<T> a(CommandContext<ds> $$0, ags<? extends ir<T>> $$1) {
      return ((ds)$$0.getSource()).l().aZ().d($$1);
   }

   private static <T> ie.c<T> b(CommandContext<ds> $$0, String $$1, ags<ir<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ags<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static ie.c<dqp<?, ?>> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, kc.av, b);
   }

   public static ie.c<dyo> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, kc.aC, c);
   }

   public static ie.c<dzx> c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, kc.aF, d);
   }

   public ags<T> a(StringReader $$0) throws CommandSyntaxException {
      agt $$1 = agt.a($$0);
      return ags.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dw $$2 ? $$2.a(this.e, dw.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hh<er<T>, er.a<T>.a> {
      public void a(er.a<T>.a $$0, ue $$1) {
         $$1.b($$0.b);
      }

      public er.a<T>.a a(ue $$0) {
         return new er.a.a($$0.u());
      }

      public void a(er.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public er.a<T>.a a(er<T> $$0) {
         return new er.a.a($$0.e);
      }

      public final class a implements hh.a<er<T>> {
         final ags<? extends ir<T>> b;

         a(ags<? extends ir<T>> $$1) {
            this.b = $$1;
         }

         public er<T> a(dn $$0) {
            return new er<>(this.b);
         }

         @Override
         public hh<er<T>, ?> a() {
            return a.this;
         }
      }
   }
}
