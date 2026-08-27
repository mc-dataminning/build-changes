import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface anh extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   aol<InputStream> a(String... var1);

   @Nullable
   aol<InputStream> a(ani var1, afw var2);

   void a(ani var1, String var2, String var3, anh.a var4);

   Set<String> a(ani var1);

   @Nullable
   <T> T a(ant<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<afw, aol<InputStream>> {
   }
}
