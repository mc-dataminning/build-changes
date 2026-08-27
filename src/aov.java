import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface aov extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   apz<InputStream> a(String... var1);

   @Nullable
   apz<InputStream> a(aow var1, ahg var2);

   void a(aow var1, String var2, String var3, aov.a var4);

   Set<String> a(aow var1);

   @Nullable
   <T> T a(aph<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ahg, apz<InputStream>> {
   }
}
