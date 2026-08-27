import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface anv extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   aoz<InputStream> a(String... var1);

   @Nullable
   aoz<InputStream> a(anw var1, agi var2);

   void a(anw var1, String var2, String var3, anv.a var4);

   Set<String> a(anw var1);

   @Nullable
   <T> T a(aoh<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<agi, aoz<InputStream>> {
   }
}
