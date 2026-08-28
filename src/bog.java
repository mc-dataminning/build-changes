import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

public class bog<T> implements Closeable {
   private static final Gson a = new Gson();
   private final Codec<T> b;
   final FileChannel c;
   private final AtomicInteger d = new AtomicInteger(1);

   public bog(Codec<T> $$0, FileChannel $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static <T> bog<T> a(Codec<T> $$0, Path $$1) throws IOException {
      FileChannel $$2 = FileChannel.open($$1, StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
      return new bog<>($$0, $$2);
   }

   public void a(T $$0) throws IOException {
      JsonElement $$1 = (JsonElement)this.b.encodeStart(JsonOps.INSTANCE, $$0).getOrThrow(IOException::new);
      this.c.position(this.c.size());
      Writer $$2 = Channels.newWriter(this.c, StandardCharsets.UTF_8);
      a.toJson($$1, a.newJsonWriter($$2));
      $$2.write(10);
      $$2.flush();
   }

   public boh<T> a() throws IOException {
      if (this.d.get() <= 0) {
         throw new IOException("Event log has already been closed");
      } else {
         this.d.incrementAndGet();
         final boh<T> $$0 = boh.a(this.b, Channels.newReader(this.c, StandardCharsets.UTF_8));
         return new boh<T>() {
            private volatile long c;

            @Nullable
            @Override
            public T a() throws IOException {
               Object var1;
               try {
                  bog.this.c.position(this.c);
                  var1 = $$0.a();
               } finally {
                  this.c = bog.this.c.position();
               }

               return (T)var1;
            }

            @Override
            public void close() throws IOException {
               bog.this.b();
            }
         };
      }
   }

   @Override
   public void close() throws IOException {
      this.b();
   }

   void b() throws IOException {
      if (this.d.decrementAndGet() <= 0) {
         this.c.close();
      }
   }
}
