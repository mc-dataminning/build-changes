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

public class fm implements ArgumentType<fm.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final ip<dch> b;

   public fm(dr $$0) {
      this.b = $$0.b(ku.f);
   }

   public static fm a(dr $$0) {
      return new fm($$0);
   }

   public fm.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static fm.b a(ip<dch> $$0, StringReader $$1) throws CommandSyntaxException {
      return (fm.b)fo.b($$0, $$1, true).map($$0x -> new fm.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new fm.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dpm> a(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dpm>)$$0.getArgument($$1, fm.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fo.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements fm.b {
      private final dpi a;
      private final Set<dql<?>> b;
      @Nullable
      private final to c;

      public a(dpi $$0, Set<dql<?>> $$1, @Nullable to $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dpm $$0) {
         dpi $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dql<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dmo $$3 = $$0.b();
               return $$3 != null && ud.a(this.c, $$3.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dpm> {
      boolean a();
   }

   static class c implements fm.b {
      private final ir<dch> a;
      @Nullable
      private final to b;
      private final Map<String, String> c;

      c(ir<dch> $$0, Map<String, String> $$1, @Nullable to $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dpm $$0) {
         dpi $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dql<?> $$3 = $$1.b().l().a($$2.getKey());
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
               dmo $$5 = $$0.b();
               return $$5 != null && ud.a(this.b, $$5.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
