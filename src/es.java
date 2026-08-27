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

public class es<T> implements ArgumentType<ahg<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vg.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vg.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vg.b("commands.place.jigsaw.invalid", $$0));
   final ahg<? extends it<T>> e;

   public es(ahg<? extends it<T>> $$0) {
      this.e = $$0;
   }

   public static <T> es<T> a(ahg<? extends it<T>> $$0) {
      return new es<>($$0);
   }

   private static <T> ahg<T> a(CommandContext<ds> $$0, String $$1, ahg<it<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ahg<?> $$4 = (ahg<?>)$$0.getArgument($$1, ahg.class);
      Optional<ahg<T>> $$5 = $$4.c($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> it<T> a(CommandContext<ds> $$0, ahg<? extends it<T>> $$1) {
      return ((ds)$$0.getSource()).l().aZ().d($$1);
   }

   private static <T> ih.c<T> b(CommandContext<ds> $$0, String $$1, ahg<it<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ahg<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static ih.c<drp<?, ?>> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ke.aw, b);
   }

   public static ih.c<dzo> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ke.aD, c);
   }

   public static ih.c<eax> c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ke.aG, d);
   }

   public ahg<T> a(StringReader $$0) throws CommandSyntaxException {
      ahh $$1 = ahh.a($$0);
      return ahg.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dx $$2 ? $$2.a(this.e, dx.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hj<es<T>, es.a<T>.a> {
      public void a(es.a<T>.a $$0, uj $$1) {
         $$1.b($$0.b);
      }

      public es.a<T>.a a(uj $$0) {
         return new es.a.a($$0.u());
      }

      public void a(es.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public es.a<T>.a a(es<T> $$0) {
         return new es.a.a($$0.e);
      }

      public final class a implements hj.a<es<T>> {
         final ahg<? extends it<T>> b;

         a(ahg<? extends it<T>> $$1) {
            this.b = $$1;
         }

         public es<T> a(dn $$0) {
            return new es<>(this.b);
         }

         @Override
         public hj<es<T>, ?> a() {
            return a.this;
         }
      }
   }
}
