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
   private final id<cva> b;

   public fi(dp $$0) {
      this.b = $$0.a(jz.e);
   }

   public static fi a(dp $$0) {
      return new fi($$0);
   }

   public fi.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static fi.b a(id<cva> $$0, StringReader $$1) throws CommandSyntaxException {
      return (fi.b)fk.b($$0, $$1, true).map($$0x -> new fi.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new fi.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dhm> a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dhm>)$$0.getArgument($$1, fi.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fk.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements fi.b {
      private final dhi a;
      private final Set<dil<?>> b;
      @Nullable
      private final rz c;

      public a(dhi $$0, Set<dil<?>> $$1, @Nullable rz $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dhm $$0) {
         dhi $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dil<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dfd $$3 = $$0.b();
               return $$3 != null && so.a(this.c, $$3.m(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dhm> {
      boolean a();
   }

   static class c implements fi.b {
      private final ig<cva> a;
      @Nullable
      private final rz b;
      private final Map<String, String> c;

      c(ig<cva> $$0, Map<String, String> $$1, @Nullable rz $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dhm $$0) {
         dhi $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dil<?> $$3 = $$1.b().n().a($$2.getKey());
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
               dfd $$5 = $$0.b();
               return $$5 != null && so.a(this.b, $$5.m(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
