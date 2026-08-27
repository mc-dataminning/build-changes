import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface aog extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   apk<InputStream> a(String... var1);

   @Nullable
   apk<InputStream> a(aoh var1, agt var2);

   void a(aoh var1, String var2, String var3, aog.a var4);

   Set<String> a(aoh var1);

   @Nullable
   <T> T a(aos<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<agt, apk<InputStream>> {
   }
}
