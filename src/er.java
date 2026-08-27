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

public class er<T> implements ArgumentType<aev<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tl.a("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tl.a("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tl.a("commands.place.jigsaw.invalid", $$0));
   final aev<? extends hq<T>> e;

   public er(aev<? extends hq<T>> $$0) {
      this.e = $$0;
   }

   public static <T> er<T> a(aev<? extends hq<T>> $$0) {
      return new er<>($$0);
   }

   private static <T> aev<T> a(CommandContext<dt> $$0, String $$1, aev<hq<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      aev<?> $$4 = (aev<?>)$$0.getArgument($$1, aev.class);
      Optional<aev<T>> $$5 = $$4.c($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> hq<T> a(CommandContext<dt> $$0, aev<? extends hq<T>> $$1) {
      return ((dt)$$0.getSource()).l().aU().d($$1);
   }

   private static <T> he.c<T> b(CommandContext<dt> $$0, String $$1, aev<hq<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      aev<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static he.c<dnj<?, ?>> a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, jc.as, b);
   }

   public static he.c<dvi> b(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, jc.az, c);
   }

   public static he.c<dwr> c(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, jc.aC, d);
   }

   public aev<T> a(StringReader $$0) throws CommandSyntaxException {
      aew $$1 = aew.a($$0);
      return aev.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dw $$2 ? $$2.a(this.e, dw.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements gi<er<T>, er.a<T>.a> {
      public void a(er.a<T>.a $$0, so $$1) {
         $$1.b($$0.b);
      }

      public er.a<T>.a a(so $$0) {
         return new er.a.a($$0.t());
      }

      public void a(er.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public er.a<T>.a a(er<T> $$0) {
         return new er.a.a($$0.e);
      }

      public final class a implements gi.a<er<T>> {
         final aev<? extends hq<T>> b;

         a(aev<? extends hq<T>> $$1) {
            this.b = $$1;
         }

         public er<T> a(dn $$0) {
            return new er<>(this.b);
         }

         @Override
         public gi<er<T>, ?> a() {
            return a.this;
         }
      }
   }
}
