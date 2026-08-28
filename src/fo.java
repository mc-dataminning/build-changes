import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.io.FilenameUtils;

public class fo<T> implements ArgumentType<Collection<jf.c<T>>> {
   private static final Collection<String> b = List.of("minecraft:*", "*:asset", "*");
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("argument.resource_selector.not_found", $$0, $$1));
   final alf<? extends js<T>> c;
   private final jh<T> d;

   fo(ef $$0, alf<? extends js<T>> $$1) {
      this.c = $$1;
      this.d = $$0.e($$1);
   }

   public Collection<jf.c<T>> a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = a(b($$0));
      List<jf.c<T>> $$2 = this.d.c().filter($$1x -> a($$1, $$1x.h().a())).toList();
      if ($$2.isEmpty()) {
         throw a.createWithContext($$0, $$1, this.c.a());
      } else {
         return $$2;
      }
   }

   public static <T> Collection<jf.c<T>> a(StringReader $$0, jh<T> $$1) {
      String $$2 = a(b($$0));
      return $$1.c().filter($$1x -> a($$2, $$1x.h().a())).toList();
   }

   private static String b(StringReader $$0) {
      int $$1 = $$0.getCursor();

      while ($$0.canRead() && a($$0.peek())) {
         $$0.skip();
      }

      return $$0.getString().substring($$1, $$0.getCursor());
   }

   private static boolean a(char $$0) {
      return alg.a($$0) || $$0 == '*' || $$0 == '?';
   }

   private static String a(String $$0) {
      return !$$0.contains(":") ? "minecraft:" + $$0 : $$0;
   }

   private static boolean a(String $$0, alg $$1) {
      return FilenameUtils.wildcardMatch($$1.toString(), $$0);
   }

   public static <T> fo<T> a(ef $$0, alf<? extends js<T>> $$1) {
      return new fo<>($$0, $$1);
   }

   public static <T> Collection<jf.c<T>> a(CommandContext<ej> $$0, String $$1, alf<? extends js<T>> $$2) {
      return (Collection<jf.c<T>>)$$0.getArgument($$1, Collection.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eo $$2 ? $$2.a(this.c, eo.a.b, $$1, $$0) : eo.b(this.d.c_().map(alf::a).map(alg::toString), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a<T> implements ig<fo<T>, fo.a<T>.a> {
      public void a(fo.a<T>.a $$0, vu $$1) {
         $$1.b($$0.b);
      }

      public fo.a<T>.a a(vu $$0) {
         return new fo.a.a($$0.r());
      }

      public void a(fo.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fo.a<T>.a a(fo<T> $$0) {
         return new fo.a.a($$0.c);
      }

      public final class a implements ig.a<fo<T>> {
         final alf<? extends js<T>> b;

         a(final alf<? extends js<T>> $$1) {
            this.b = $$1;
         }

         public fo<T> a(ef $$0) {
            return new fo<>($$0, this.b);
         }

         @Override
         public ig<fo<T>, ?> a() {
            return a.this;
         }
      }
   }
}
