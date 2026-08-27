import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.lang.reflect.Field;

public class dz {
   private static final Field a = ac.a(() -> {
      try {
         Field $$0 = JsonReader.class.getDeclaredField("pos");
         $$0.setAccessible(true);
         return $$0;
      } catch (NoSuchFieldException var1) {
         throw new IllegalStateException("Couldn't get field 'pos' for JsonReader", var1);
      }
   });
   private static final Field b = ac.a(() -> {
      try {
         Field $$0 = JsonReader.class.getDeclaredField("lineStart");
         $$0.setAccessible(true);
         return $$0;
      } catch (NoSuchFieldException var1) {
         throw new IllegalStateException("Couldn't get field 'lineStart' for JsonReader", var1);
      }
   });

   private static int a(JsonReader $$0) {
      try {
         return a.getInt($$0) - b.getInt($$0);
      } catch (IllegalAccessException var2) {
         throw new IllegalStateException("Couldn't read position of JsonReader", var2);
      }
   }

   public static <T> T a(ip.a $$0, StringReader $$1, Codec<T> $$2) {
      JsonReader $$3 = new JsonReader(new java.io.StringReader($$1.getRemaining()));
      $$3.setLenient(false);

      Object var5;
      try {
         JsonElement $$4 = Streams.parse($$3);
         var5 = ac.a($$2.parse($$0.a(JsonOps.INSTANCE), $$4), JsonParseException::new);
      } catch (StackOverflowError var9) {
         throw new JsonParseException(var9);
      } finally {
         $$1.setCursor($$1.getCursor() + a($$3));
      }

      return (T)var5;
   }

   public static String a(StringReader $$0, m $$1) {
      int $$2 = $$0.getCursor();

      while ($$0.canRead() && $$1.test($$0.peek())) {
         $$0.skip();
      }

      return $$0.getString().substring($$2, $$0.getCursor());
   }
}
