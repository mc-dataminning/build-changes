import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface aow extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   aqa<InputStream> a(String... var1);

   @Nullable
   aqa<InputStream> a(aox var1, ahg var2);

   void a(aox var1, String var2, String var3, aow.a var4);

   Set<String> a(aox var1);

   @Nullable
   <T> T a(api<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ahg, aqa<InputStream>> {
   }
}
