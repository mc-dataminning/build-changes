import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface amh extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   anl<InputStream> a(String... var1);

   @Nullable
   anl<InputStream> a(ami var1, aew var2);

   void a(ami var1, String var2, String var3, amh.a var4);

   Set<String> a(ami var1);

   @Nullable
   <T> T a(amt<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<aew, anl<InputStream>> {
   }
}
