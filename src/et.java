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

public class et<T> implements ArgumentType<agh<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ur.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ur.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ur.b("commands.place.jigsaw.invalid", $$0));
   final agh<? extends io<T>> e;

   public et(agh<? extends io<T>> $$0) {
      this.e = $$0;
   }

   public static <T> et<T> a(agh<? extends io<T>> $$0) {
      return new et<>($$0);
   }

   private static <T> agh<T> a(CommandContext<du> $$0, String $$1, agh<io<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      agh<?> $$4 = (agh<?>)$$0.getArgument($$1, agh.class);
      Optional<agh<T>> $$5 = $$4.c($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> io<T> a(CommandContext<du> $$0, agh<? extends io<T>> $$1) {
      return ((du)$$0.getSource()).m().aZ().d($$1);
   }

   private static <T> ib.c<T> b(CommandContext<du> $$0, String $$1, agh<io<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      agh<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static ib.c<dpi<?, ?>> a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, jz.au, b);
   }

   public static ib.c<dxh> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, jz.aB, c);
   }

   public static ib.c<dyq> c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, jz.aE, d);
   }

   public agh<T> a(StringReader $$0) throws CommandSyntaxException {
      agi $$1 = agi.a($$0);
      return agh.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dy $$2 ? $$2.a(this.e, dy.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hf<et<T>, et.a<T>.a> {
      public void a(et.a<T>.a $$0, tu $$1) {
         $$1.b($$0.b);
      }

      public et.a<T>.a a(tu $$0) {
         return new et.a.a($$0.u());
      }

      public void a(et.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public et.a<T>.a a(et<T> $$0) {
         return new et.a.a($$0.e);
      }

      public final class a implements hf.a<et<T>> {
         final agh<? extends io<T>> b;

         a(agh<? extends io<T>> $$1) {
            this.b = $$1;
         }

         public et<T> a(dp $$0) {
            return new et<>(this.b);
         }

         @Override
         public hf<et<T>, ?> a() {
            return a.this;
         }
      }
   }
}
