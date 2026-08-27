import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;

public interface arc<T> extends arb<T> {
   JsonObject a(T var1);

   static <T> arc<T> a(final String $$0, final Codec<T> $$1) {
      return new arc<T>() {
         @Override
         public String a() {
            return $$0;
         }

         @Override
         public T a(JsonObject $$0x) {
            return ac.a($$1.parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
         }

         @Override
         public JsonObject a(T $$0x) {
            return ac.<JsonElement, IllegalArgumentException>a($$1.encodeStart(JsonOps.INSTANCE, $$0), IllegalArgumentException::new).getAsJsonObject();
         }
      };
   }
}
