import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface ajl extends AutoCloseable {
   String b = ".mcmeta";
   String c = "pack.mcmeta";

   @Nullable
   akp<InputStream> a(String... var1);

   @Nullable
   akp<InputStream> a(ajm var1, acq var2);

   void a(ajm var1, String var2, String var3, ajl.a var4);

   Set<String> a(ajm var1);

   @Nullable
   <T> T a(ajx<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<acq, akp<InputStream>> {
   }
}
