import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
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

public class bkr<T> implements Closeable {
   private static final Gson a = new Gson();
   private final Codec<T> b;
   final FileChannel c;
   private final AtomicInteger d = new AtomicInteger(1);

   public bkr(Codec<T> $$0, FileChannel $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static <T> bkr<T> a(Codec<T> $$0, Path $$1) throws IOException {
      FileChannel $$2 = FileChannel.open($$1, StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
      return new bkr<>($$0, $$2);
   }

   public void a(T $$0) throws IOException, JsonIOException {
      JsonElement $$1 = ac.a(this.b.encodeStart(JsonOps.INSTANCE, $$0), IOException::new);
      this.c.position(this.c.size());
      Writer $$2 = Channels.newWriter(this.c, StandardCharsets.UTF_8);
      a.toJson($$1, $$2);
      $$2.write(10);
      $$2.flush();
   }

   public bks<T> a() throws IOException {
      if (this.d.get() <= 0) {
         throw new IOException("Event log has already been closed");
      } else {
         this.d.incrementAndGet();
         final bks<T> $$0 = bks.a(this.b, Channels.newReader(this.c, StandardCharsets.UTF_8));
         return new bks<T>() {
            private volatile long c;

            @Nullable
            @Override
            public T a() throws IOException {
               Object var1;
               try {
                  bkr.this.c.position(this.c);
                  var1 = $$0.a();
               } finally {
                  this.c = bkr.this.c.position();
               }

               return (T)var1;
            }

            @Override
            public void close() throws IOException {
               bkr.this.b();
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
