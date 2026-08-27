import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;

public interface ajy<T> extends ajx<T> {
   JsonObject a(T var1);

   static <T> ajy<T> a(final String $$0, final Codec<T> $$1) {
      return new ajy<T>() {
         @Override
         public String a() {
            return $$0;
         }

         @Override
         public T a(JsonObject $$0x) {
            return (T)$$1.parse(JsonOps.INSTANCE, $$0).getOrThrow(false, $$0xx -> {
            });
         }

         @Override
         public JsonObject a(T $$0x) {
            return ((JsonElement)$$1.encodeStart(JsonOps.INSTANCE, $$0).getOrThrow(false, $$0xx -> {
            })).getAsJsonObject();
         }
      };
   }
}
