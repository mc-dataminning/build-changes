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

public class fc<T> implements ArgumentType<ake<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ws.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ws.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ws.b("commands.place.jigsaw.invalid", $$0));
   final ake<? extends ji<T>> e;

   public fc(ake<? extends ji<T>> $$0) {
      this.e = $$0;
   }

   public static <T> fc<T> a(ake<? extends ji<T>> $$0) {
      return new fc<>($$0);
   }

   private static <T> ake<T> a(CommandContext<ec> $$0, String $$1, ake<ji<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ake<?> $$4 = (ake<?>)$$0.getArgument($$1, ake.class);
      Optional<ake<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> ji<T> a(CommandContext<ec> $$0, ake<? extends ji<T>> $$1) {
      return ((ec)$$0.getSource()).l().bd().d($$1);
   }

   private static <T> iv.c<T> b(CommandContext<ec> $$0, String $$1, ake<ji<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ake<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static iv.c<dyh<?, ?>> a(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ld.aB, b);
   }

   public static iv.c<egg> b(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ld.aI, c);
   }

   public static iv.c<ehp> c(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ld.aL, d);
   }

   public ake<T> a(StringReader $$0) throws CommandSyntaxException {
      akf $$1 = akf.a($$0);
      return ake.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eh $$2 ? $$2.a(this.e, eh.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hw<fc<T>, fc.a<T>.a> {
      public void a(fc.a<T>.a $$0, vs $$1) {
         $$1.b($$0.b);
      }

      public fc.a<T>.a a(vs $$0) {
         return new fc.a.a($$0.r());
      }

      public void a(fc.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fc.a<T>.a a(fc<T> $$0) {
         return new fc.a.a($$0.e);
      }

      public final class a implements hw.a<fc<T>> {
         final ake<? extends ji<T>> b;

         a(ake<? extends ji<T>> $$1) {
            this.b = $$1;
         }

         public fc<T> a(dy $$0) {
            return new fc<>(this.b);
         }

         @Override
         public hw<fc<T>, ?> a() {
            return a.this;
         }
      }
   }
}
