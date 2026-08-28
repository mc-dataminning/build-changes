import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface atr extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   auw<InputStream> a(String... var1);

   @Nullable
   auw<InputStream> a(att var1, ali var2);

   void a(att var1, String var2, String var3, atr.a var4);

   Set<String> a(att var1);

   @Nullable
   <T> T a(aue<T> var1) throws IOException;

   atq a();

   default String b() {
      return this.a().a();
   }

   default Optional<aul> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ali, auw<InputStream>> {
   }
}
