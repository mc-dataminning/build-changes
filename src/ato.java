import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface ato extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   auu<InputStream> a(String... var1);

   @Nullable
   auu<InputStream> a(atq var1, alj var2);

   void a(atq var1, String var2, String var3, ato.a var4);

   Set<String> a(atq var1);

   @Nullable
   <T> T a(aub<T> var1) throws IOException;

   atn a();

   default String b() {
      return this.a().a();
   }

   default Optional<auj> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<alj, auu<InputStream>> {
   }
}
