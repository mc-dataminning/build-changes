import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import javax.annotation.Nullable;

public interface bab<T> extends Closeable {
   static <T> bab<T> a(final Codec<T> $$0, Reader $$1) {
      final JsonReader $$2 = new JsonReader($$1);
      $$2.setLenient(true);
      return new bab<T>() {
         @Nullable
         @Override
         public T a() throws IOException {
            try {
               if (!$$2.hasNext()) {
                  return null;
               } else {
                  JsonElement $$0 = JsonParser.parseReader($$2);
                  return ac.a($$0.parse(JsonOps.INSTANCE, $$0), IOException::new);
               }
            } catch (JsonParseException var2) {
               throw new IOException(var2);
            } catch (EOFException var3) {
               return null;
            }
         }

         @Override
         public void close() throws IOException {
            $$2.close();
         }
      };
   }

   @Nullable
   T a() throws IOException;
}
