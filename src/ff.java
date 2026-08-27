import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ff implements ArgumentType<ff.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final hh<csk> b;

   public ff(dm $$0) {
      this.b = $$0.a(jd.e);
   }

   public static ff a(dm $$0) {
      return new ff($$0);
   }

   public ff.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static ff.b a(hh<csk> $$0, StringReader $$1) throws CommandSyntaxException {
      return (ff.b)fh.b($$0, $$1, true).map($$0x -> new ff.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new ff.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dfc> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dfc>)$$0.getArgument($$1, ff.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fh.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements ff.b {
      private final dey a;
      private final Set<dgb<?>> b;
      @Nullable
      private final qs c;

      public a(dey $$0, Set<dgb<?>> $$1, @Nullable qs $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dfc $$0) {
         dey $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dgb<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dck $$3 = $$0.b();
               return $$3 != null && re.a(this.c, $$3.m(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dfc> {
      boolean a();
   }

   static class c implements ff.b {
      private final hj<csk> a;
      @Nullable
      private final qs b;
      private final Map<String, String> c;

      c(hj<csk> $$0, Map<String, String> $$1, @Nullable qs $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dfc $$0) {
         dey $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dgb<?> $$3 = $$1.b().l().a($$2.getKey());
               if ($$3 == null) {
                  return false;
               }

               Comparable<?> $$4 = (Comparable<?>)$$3.b($$2.getValue()).orElse(null);
               if ($$4 == null) {
                  return false;
               }

               if ($$1.c($$3) != $$4) {
                  return false;
               }
            }

            if (this.b == null) {
               return true;
            } else {
               dck $$5 = $$0.b();
               return $$5 != null && re.a(this.b, $$5.m(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
