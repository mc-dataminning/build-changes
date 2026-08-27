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
   private final hi<csx> b;

   public fg(dn $$0) {
      this.b = $$0.a(je.e);
   }

   public static fg a(dn $$0) {
      return new fg($$0);
   }

   public fg.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static fg.b a(hi<csx> $$0, StringReader $$1) throws CommandSyntaxException {
      return (fg.b)fi.b($$0, $$1, true).map($$0x -> new fg.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new fg.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dfp> a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dfp>)$$0.getArgument($$1, fg.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fi.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements fg.b {
      private final dfl a;
      private final Set<dgo<?>> b;
      @Nullable
      private final qy c;

      public a(dfl $$0, Set<dgo<?>> $$1, @Nullable qy $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dfp $$0) {
         dfl $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dgo<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dcx $$3 = $$0.b();
               return $$3 != null && rl.a(this.c, $$3.m(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dfp> {
      boolean a();
   }

   static class c implements fg.b {
      private final hk<csx> a;
      @Nullable
      private final qy b;
      private final Map<String, String> c;

      c(hk<csx> $$0, Map<String, String> $$1, @Nullable qy $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dfp $$0) {
         dfl $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dgo<?> $$3 = $$1.b().l().a($$2.getKey());
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
               dcx $$5 = $$0.b();
               return $$5 != null && rl.a(this.b, $$5.m(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
