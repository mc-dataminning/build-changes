import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

public class ayj implements TypeAdapterFactory {
   @Nullable
   public <T> TypeAdapter<T> create(Gson $$0, TypeToken<T> $$1) {
      Class<T> $$2 = $$1.getRawType();
      if (!$$2.isEnum()) {
         return null;
      } else {
         final Map<String, T> $$3 = Maps.newHashMap();

         for (T $$4 : $$2.getEnumConstants()) {
            $$3.put(this.a($$4), $$4);
         }

         return new TypeAdapter<T>() {
            public void write(JsonWriter $$0, T $$1) throws IOException {
               if ($$1 == null) {
                  $$0.nullValue();
               } else {
                  $$0.value(ayj.this.a($$1));
               }
            }

            @Nullable
            public T read(JsonReader $$0) throws IOException {
               if ($$0.peek() == JsonToken.NULL) {
                  $$0.nextNull();
                  return null;
               } else {
                  return $$3.get($$0.nextString());
               }
            }
         };
      }
   }

   String a(Object $$0) {
      return $$0 instanceof Enum ? ((Enum)$$0).name().toLowerCase(Locale.ROOT) : $$0.toString().toLowerCase(Locale.ROOT);
   }
}
