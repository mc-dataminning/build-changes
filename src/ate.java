import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface ate extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   auk<InputStream> a(String... var1);

   @Nullable
   auk<InputStream> a(atg var1, alb var2);

   void a(atg var1, String var2, String var3, ate.a var4);

   Set<String> a(atg var1);

   @Nullable
   <T> T a(atr<T> var1) throws IOException;

   atd a();

   default String b() {
      return this.a().a();
   }

   default Optional<atz> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<alb, auk<InputStream>> {
   }
}
