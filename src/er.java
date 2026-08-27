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

public class er<T> implements ArgumentType<aet<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ti.a("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ti.a("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ti.a("commands.place.jigsaw.invalid", $$0));
   final aet<? extends ht<T>> e;

   public er(aet<? extends ht<T>> $$0) {
      this.e = $$0;
   }

   public static <T> er<T> a(aet<? extends ht<T>> $$0) {
      return new er<>($$0);
   }

   private static <T> aet<T> a(CommandContext<dt> $$0, String $$1, aet<ht<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      aet<?> $$4 = (aet<?>)$$0.getArgument($$1, aet.class);
      Optional<aet<T>> $$5 = $$4.c($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> ht<T> a(CommandContext<dt> $$0, aet<? extends ht<T>> $$1) {
      return ((dt)$$0.getSource()).l().aU().d($$1);
   }

   private static <T> hg.c<T> b(CommandContext<dt> $$0, String $$1, aet<ht<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      aet<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static hg.c<dne<?, ?>> a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, je.as, b);
   }

   public static hg.c<dvd> b(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, je.az, c);
   }

   public static hg.c<dwm> c(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, je.aC, d);
   }

   public aet<T> a(StringReader $$0) throws CommandSyntaxException {
      aeu $$1 = aeu.a($$0);
      return aet.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dw $$2 ? $$2.a(this.e, dw.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements gi<er<T>, er.a<T>.a> {
      public void a(er.a<T>.a $$0, sl $$1) {
         $$1.b($$0.b);
      }

      public er.a<T>.a a(sl $$0) {
         return new er.a.a($$0.t());
      }

      public void a(er.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public er.a<T>.a a(er<T> $$0) {
         return new er.a.a($$0.e);
      }

      public final class a implements gi.a<er<T>> {
         final aet<? extends ht<T>> b;

         a(aet<? extends ht<T>> $$1) {
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
