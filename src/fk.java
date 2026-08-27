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

public class fk implements ArgumentType<fk.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final in<dac> b;

   public fk(dq $$0) {
      this.b = $$0.b(kj.f);
   }

   public static fk a(dq $$0) {
      return new fk($$0);
   }

   public fk.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static fk.b a(in<dac> $$0, StringReader $$1) throws CommandSyntaxException {
      return (fk.b)fm.b($$0, $$1, true).map($$0x -> new fk.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new fk.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dnf> a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dnf>)$$0.getArgument($$1, fk.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fm.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements fk.b {
      private final dnb a;
      private final Set<doe<?>> b;
      @Nullable
      private final ta c;

      public a(dnb $$0, Set<doe<?>> $$1, @Nullable ta $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dnf $$0) {
         dnb $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (doe<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dki $$3 = $$0.b();
               return $$3 != null && tp.a(this.c, $$3.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dnf> {
      boolean a();
   }

   static class c implements fk.b {
      private final ip<dac> a;
      @Nullable
      private final ta b;
      private final Map<String, String> c;

      c(ip<dac> $$0, Map<String, String> $$1, @Nullable ta $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dnf $$0) {
         dnb $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               doe<?> $$3 = $$1.b().n().a($$2.getKey());
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
               dki $$5 = $$0.b();
               return $$5 != null && tp.a(this.b, $$5.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
