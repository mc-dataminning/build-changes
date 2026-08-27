import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface amj extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   ann<InputStream> a(String... var1);

   @Nullable
   ann<InputStream> a(amk var1, aey var2);

   void a(amk var1, String var2, String var3, amj.a var4);

   Set<String> a(amk var1);

   @Nullable
   <T> T a(amv<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<aey, ann<InputStream>> {
   }
}
