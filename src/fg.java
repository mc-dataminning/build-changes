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

public class fg implements ArgumentType<fg.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final ih<cvz> b;

   public fg(dn $$0) {
      this.b = $$0.a(kc.f);
   }

   public static fg a(dn $$0) {
      return new fg($$0);
   }

   public fg.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static fg.b a(ih<cvz> $$0, StringReader $$1) throws CommandSyntaxException {
      return (fg.b)fi.b($$0, $$1, true).map($$0x -> new fg.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new fg.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dit> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dit>)$$0.getArgument($$1, fg.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fi.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements fg.b {
      private final dip a;
      private final Set<djs<?>> b;
      @Nullable
      private final sj c;

      public a(dip $$0, Set<djs<?>> $$1, @Nullable sj $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dit $$0) {
         dip $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (djs<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dgd $$3 = $$0.b();
               return $$3 != null && sy.a(this.c, $$3.o(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dit> {
      boolean a();
   }

   static class c implements fg.b {
      private final ij<cvz> a;
      @Nullable
      private final sj b;
      private final Map<String, String> c;

      c(ij<cvz> $$0, Map<String, String> $$1, @Nullable sj $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dit $$0) {
         dip $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               djs<?> $$3 = $$1.b().n().a($$2.getKey());
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
               dgd $$5 = $$0.b();
               return $$5 != null && sy.a(this.b, $$5.o(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
