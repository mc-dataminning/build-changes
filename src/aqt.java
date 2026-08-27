import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface aqt extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   arx<InputStream> a(String... var1);

   @Nullable
   arx<InputStream> a(aqu var1, ajc var2);

   void a(aqu var1, String var2, String var3, aqt.a var4);

   Set<String> a(aqu var1);

   @Nullable
   <T> T a(arf<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ajc, arx<InputStream>> {
   }
}
