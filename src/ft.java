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

public class ft implements ArgumentType<ft.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final ix<dcv> b;

   public ft(dy $$0) {
      this.b = $$0.b(ld.f);
   }

   public static ft a(dy $$0) {
      return new ft($$0);
   }

   public ft.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static ft.b a(ix<dcv> $$0, StringReader $$1) throws CommandSyntaxException {
      return (ft.b)fv.b($$0, $$1, true).map($$0x -> new ft.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new ft.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dqc> a(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dqc>)$$0.getArgument($$1, ft.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fv.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements ft.b {
      private final dpy a;
      private final Set<drb<?>> b;
      @Nullable
      private final ty c;

      public a(dpy $$0, Set<drb<?>> $$1, @Nullable ty $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dqc $$0) {
         dpy $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (drb<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dnd $$3 = $$0.b();
               return $$3 != null && un.a(this.c, $$3.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dqc> {
      boolean a();
   }

   static class c implements ft.b {
      private final iz<dcv> a;
      @Nullable
      private final ty b;
      private final Map<String, String> c;

      c(iz<dcv> $$0, Map<String, String> $$1, @Nullable ty $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dqc $$0) {
         dpy $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               drb<?> $$3 = $$1.b().l().a($$2.getKey());
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
               dnd $$5 = $$0.b();
               return $$5 != null && un.a(this.b, $$5.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
