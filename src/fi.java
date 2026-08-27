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

public class fi implements ArgumentType<fi.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final ij<cwy> b;

   public fi(dn $$0) {
      this.b = $$0.a(ke.f);
   }

   public static fi a(dn $$0) {
      return new fi($$0);
   }

   public fi.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static fi.b a(ij<cwy> $$0, StringReader $$1) throws CommandSyntaxException {
      return (fi.b)fk.b($$0, $$1, true).map($$0x -> new fi.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new fi.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<djt> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<djt>)$$0.getArgument($$1, fi.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fk.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements fi.b {
      private final djp a;
      private final Set<dks<?>> b;
      @Nullable
      private final so c;

      public a(djp $$0, Set<dks<?>> $$1, @Nullable so $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(djt $$0) {
         djp $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dks<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dhd $$3 = $$0.b();
               return $$3 != null && td.a(this.c, $$3.o(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<djt> {
      boolean a();
   }

   static class c implements fi.b {
      private final il<cwy> a;
      @Nullable
      private final so b;
      private final Map<String, String> c;

      c(il<cwy> $$0, Map<String, String> $$1, @Nullable so $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(djt $$0) {
         djp $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dks<?> $$3 = $$1.b().n().a($$2.getKey());
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
               dhd $$5 = $$0.b();
               return $$5 != null && td.a(this.b, $$5.o(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
