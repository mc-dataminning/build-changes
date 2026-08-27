import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.lang.reflect.Field;

public class dy {
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
         return a.getInt($$0) - b.getInt($$0) + 1;
      } catch (IllegalAccessException var2) {
         throw new IllegalStateException("Couldn't read position of JsonReader", var2);
      }
   }

   public static <T> T a(StringReader $$0, Codec<T> $$1) {
      JsonReader $$2 = new JsonReader(new java.io.StringReader($$0.getRemaining()));
      $$2.setLenient(false);

      Object var4;
      try {
         JsonElement $$3 = Streams.parse($$2);
         var4 = ac.a($$1.parse(JsonOps.INSTANCE, $$3), JsonParseException::new);
      } catch (StackOverflowError var8) {
         throw new JsonParseException(var8);
      } finally {
         $$0.setCursor($$0.getCursor() + a($$2));
      }

      return (T)var4;
   }
}
