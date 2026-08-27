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

   public static <T> T a(in.a $$0, StringReader $$1, Codec<T> $$2) {
      JsonReader $$3 = new JsonReader(new java.io.StringReader($$1.getRemaining()));
      $$3.setLenient(false);

      Object var5;
      try {
         JsonElement $$4 = Streams.parse($$3);
         var5 = ac.a($$2.parse(aja.a(JsonOps.INSTANCE, $$0), $$4), JsonParseException::new);
      } catch (StackOverflowError var9) {
         throw new JsonParseException(var9);
      } finally {
         $$1.setCursor($$1.getCursor() + a($$3));
      }

      return (T)var5;
   }
}
