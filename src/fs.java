import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fs implements ArgumentType<Integer> {
   private static final Collection<String> a = Arrays.asList("0d", "0s", "0t", "0");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("argument.time.invalid_unit"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("argument.time.tick_count_too_low", $$1, $$0));
   private static final Object2IntMap<String> d = new Object2IntOpenHashMap();
   final int e;

   private fs(int $$0) {
      this.e = $$0;
   }

   public static fs a() {
      return new fs(0);
   }

   public static fs a(int $$0) {
      return new fs($$0);
   }

   public Integer a(StringReader $$0) throws CommandSyntaxException {
      float $$1 = $$0.readFloat();
      String $$2 = $$0.readUnquotedString();
      int $$3 = d.getOrDefault($$2, 0);
      if ($$3 == 0) {
         throw b.createWithContext($$0);
      } else {
         int $$4 = Math.round($$1 * (float)$$3);
         if ($$4 < this.e) {
            throw c.createWithContext($$0, $$4, this.e);
         } else {
            return $$4;
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      StringReader $$2 = new StringReader($$1.getRemaining());

      try {
         $$2.readFloat();
      } catch (CommandSyntaxException var5) {
         return $$1.buildFuture();
      }

      return ei.b(d.keySet(), $$1.createOffset($$1.getStart() + $$2.getCursor()));
   }

   public Collection<String> getExamples() {
      return a;
   }

   static {
      d.put("d", 24000);
      d.put("s", 20);
      d.put("t", 1);
      d.put("", 1);
   }

   public static class a implements hx<fs, fs.a.a> {
      public void a(fs.a.a $$0, vu $$1) {
         $$1.p($$0.b);
      }

      public fs.a.a a(vu $$0) {
         int $$1 = $$0.readInt();
         return new fs.a.a($$1);
      }

      public void a(fs.a.a $$0, JsonObject $$1) {
         $$1.addProperty("min", $$0.b);
      }

      public fs.a.a a(fs $$0) {
         return new fs.a.a($$0.e);
      }

      public final class a implements hx.a<fs> {
         final int b;

         a(int $$1) {
            this.b = $$1;
         }

         public fs a(dz $$0) {
            return fs.a(this.b);
         }

         @Override
         public hx<fs, ?> a() {
            return a.this;
         }
      }
   }
}
