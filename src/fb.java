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

public class fb implements ArgumentType<Integer> {
   private static final Collection<String> a = Arrays.asList("0d", "0s", "0t", "0");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("argument.time.invalid_unit"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> tf.a("argument.time.tick_count_too_low", $$1, $$0));
   private static final Object2IntMap<String> d = new Object2IntOpenHashMap();
   final int e;

   private fb(int $$0) {
      this.e = $$0;
   }

   public static fb a() {
      return new fb(0);
   }

   public static fb a(int $$0) {
      return new fb($$0);
   }

   public Integer a(StringReader $$0) throws CommandSyntaxException {
      float $$1 = $$0.readFloat();
      String $$2 = $$0.readUnquotedString();
      int $$3 = d.getOrDefault($$2, 0);
      if ($$3 == 0) {
         throw b.create();
      } else {
         int $$4 = Math.round($$1 * (float)$$3);
         if ($$4 < this.e) {
            throw c.create($$4, this.e);
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

      return du.b(d.keySet(), $$1.createOffset($$1.getStart() + $$2.getCursor()));
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

   public static class a implements gg<fb, fb.a.a> {
      public void a(fb.a.a $$0, si $$1) {
         $$1.p($$0.b);
      }

      public fb.a.a a(si $$0) {
         int $$1 = $$0.readInt();
         return new fb.a.a($$1);
      }

      public void a(fb.a.a $$0, JsonObject $$1) {
         $$1.addProperty("min", $$0.b);
      }

      public fb.a.a a(fb $$0) {
         return new fb.a.a($$0.e);
      }

      public final class a implements gg.a<fb> {
         final int b;

         a(int $$1) {
            this.b = $$1;
         }

         public fb a(dl $$0) {
            return fb.a(this.b);
         }

         @Override
         public gg<fb, ?> a() {
            return a.this;
         }
      }
   }
}
