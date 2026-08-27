import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface aro extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   asu<InputStream> a(String... var1);

   @Nullable
   asu<InputStream> a(arq var1, ajt var2);

   void a(arq var1, String var2, String var3, aro.a var4);

   Set<String> a(arq var1);

   @Nullable
   <T> T a(asb<T> var1) throws IOException;

   arn a();

   default String b() {
      return this.a().a();
   }

   default Optional<asj> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ajt, asu<InputStream>> {
   }
}
