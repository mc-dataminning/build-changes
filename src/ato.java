import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;

public interface ato<T> extends atn<T> {
   JsonObject a(T var1);

   static <T> ato<T> a(final String $$0, final Codec<T> $$1) {
      return new ato<T>() {
         @Override
         public String a() {
            return $$0;
         }

         @Override
         public T a(JsonObject $$0x) {
            return (T)$$1.parse(JsonOps.INSTANCE, $$0).getOrThrow(JsonParseException::new);
         }

         @Override
         public JsonObject a(T $$0x) {
            return ((JsonElement)$$1.encodeStart(JsonOps.INSTANCE, $$0).getOrThrow(IllegalArgumentException::new)).getAsJsonObject();
         }
      };
   }
}
