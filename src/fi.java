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
   private final ij<cwq> b;

   public fi(dn $$0) {
      this.b = $$0.a(ke.f);
   }

   public static fi a(dn $$0) {
      return new fi($$0);
   }

   public fi.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static fi.b a(ij<cwq> $$0, StringReader $$1) throws CommandSyntaxException {
      return (fi.b)fk.b($$0, $$1, true).map($$0x -> new fi.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new fi.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<djl> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<djl>)$$0.getArgument($$1, fi.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fk.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements fi.b {
      private final djh a;
      private final Set<dkk<?>> b;
      @Nullable
      private final sn c;

      public a(djh $$0, Set<dkk<?>> $$1, @Nullable sn $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(djl $$0) {
         djh $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dkk<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dgv $$3 = $$0.b();
               return $$3 != null && tc.a(this.c, $$3.o(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<djl> {
      boolean a();
   }

   static class c implements fi.b {
      private final il<cwq> a;
      @Nullable
      private final sn b;
      private final Map<String, String> c;

      c(il<cwq> $$0, Map<String, String> $$1, @Nullable sn $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(djl $$0) {
         djh $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dkk<?> $$3 = $$1.b().n().a($$2.getKey());
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
               dgv $$5 = $$0.b();
               return $$5 != null && tc.a(this.b, $$5.o(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
