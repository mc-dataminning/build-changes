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

public class fi<T> implements ArgumentType<alf<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("commands.place.jigsaw.invalid", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wy.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wy.b("advancement.advancementNotFound", $$0));
   final alf<? extends jr<T>> g;

   public fi(alf<? extends jr<T>> $$0) {
      this.g = $$0;
   }

   public static <T> fi<T> a(alf<? extends jr<T>> $$0) {
      return new fi<>($$0);
   }

   public static <T> alf<T> a(CommandContext<ei> $$0, String $$1, alf<jr<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alf<?> $$4 = (alf<?>)$$0.getArgument($$1, alf.class);
      Optional<alf<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4.a()));
   }

   private static <T> jr<T> a(CommandContext<ei> $$0, alf<? extends jr<T>> $$1) {
      return ((ei)$$0.getSource()).l().ba().f($$1);
   }

   private static <T> je.c<T> b(CommandContext<ei> $$0, String $$1, alf<jr<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alf<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).a($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static je.c<eiy<?, ?>> a(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mg.aL, b);
   }

   public static je.c<erb> b(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mg.be, c);
   }

   public static je.c<esl> c(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mg.bf, d);
   }

   public static ddz<?> d(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      deb $$2 = ((ei)$$0.getSource()).l().aI();
      alf<ddu<?>> $$3 = a($$0, $$1, mg.bu, e);
      return $$2.b($$3).orElseThrow(() -> e.create($$3.a()));
   }

   public static ai e(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      alf<ah> $$2 = a($$0, $$1, mg.bt, f);
      ai $$3 = ((ei)$$0.getSource()).l().aD().a($$2.a());
      if ($$3 == null) {
         throw f.create($$2.a());
      } else {
         return $$3;
      }
   }

   public alf<T> a(StringReader $$0) throws CommandSyntaxException {
      alg $$1 = alg.a($$0);
      return alf.a(this.g, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof en $$2 ? $$2.a(this.g, en.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ie<fi<T>, fi.a<T>.a> {
      public void a(fi.a<T>.a $$0, vu $$1) {
         $$1.b($$0.b);
      }

      public fi.a<T>.a a(vu $$0) {
         return new fi.a.a($$0.r());
      }

      public void a(fi.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fi.a<T>.a a(fi<T> $$0) {
         return new fi.a.a($$0.g);
      }

      public final class a implements ie.a<fi<T>> {
         final alf<? extends jr<T>> b;

         a(final alf<? extends jr<T>> $$1) {
            this.b = $$1;
         }

         public fi<T> a(ee $$0) {
            return new fi<>(this.b);
         }

         @Override
         public ie<fi<T>, ?> a() {
            return a.this;
         }
      }
   }
}
