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

public class fu<T> implements ArgumentType<ald<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("commands.place.jigsaw.invalid", $$0));
   final ald<? extends kb<T>> e;

   public fu(ald<? extends kb<T>> $$0) {
      this.e = $$0;
   }

   public static <T> fu<T> a(ald<? extends kb<T>> $$0) {
      return new fu<>($$0);
   }

   private static <T> ald<T> a(CommandContext<eu> $$0, String $$1, ald<kb<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ald<?> $$4 = (ald<?>)$$0.getArgument($$1, ald.class);
      Optional<ald<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> kb<T> a(CommandContext<eu> $$0, ald<? extends kb<T>> $$1) {
      return ((eu)$$0.getSource()).l().bb().e($$1);
   }

   private static <T> jo.c<T> b(CommandContext<eu> $$0, String $$1, ald<kb<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ald<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).a($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static jo.c<edg<?, ?>> a(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lw.aK, b);
   }

   public static jo.c<elg> b(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lw.aT, c);
   }

   public static jo.c<emq> c(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lw.aW, d);
   }

   public ald<T> a(StringReader $$0) throws CommandSyntaxException {
      ale $$1 = ale.a($$0);
      return ald.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ez $$2 ? $$2.a(this.e, ez.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements iq<fu<T>, fu.a<T>.a> {
      public void a(fu.a<T>.a $$0, wb $$1) {
         $$1.b($$0.b);
      }

      public fu.a<T>.a a(wb $$0) {
         return new fu.a.a($$0.r());
      }

      public void a(fu.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fu.a<T>.a a(fu<T> $$0) {
         return new fu.a.a($$0.e);
      }

      public final class a implements iq.a<fu<T>> {
         final ald<? extends kb<T>> b;

         a(final ald<? extends kb<T>> $$1) {
            this.b = $$1;
         }

         public fu<T> a(eq $$0) {
            return new fu<>(this.b);
         }

         @Override
         public iq<fu<T>, ?> a() {
            return a.this;
         }
      }
   }
}
