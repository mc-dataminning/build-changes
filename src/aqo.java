import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface aqo extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   ars<InputStream> a(String... var1);

   @Nullable
   ars<InputStream> a(aqp var1, aiy var2);

   void a(aqp var1, String var2, String var3, aqo.a var4);

   Set<String> a(aqp var1);

   @Nullable
   <T> T a(ara<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<aiy, ars<InputStream>> {
   }
}
