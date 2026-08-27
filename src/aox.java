import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface aox extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   aqb<InputStream> a(String... var1);

   @Nullable
   aqb<InputStream> a(aoy var1, ahh var2);

   void a(aoy var1, String var2, String var3, aox.a var4);

   Set<String> a(aoy var1);

   @Nullable
   <T> T a(apj<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ahh, aqb<InputStream>> {
   }
}
