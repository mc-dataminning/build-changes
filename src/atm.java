import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface atm extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   aur<InputStream> a(String... var1);

   @Nullable
   aur<InputStream> a(ato var1, ald var2);

   void a(ato var1, String var2, String var3, atm.a var4);

   Set<String> a(ato var1);

   @Nullable
   <T> T a(atz<T> var1) throws IOException;

   atl a();

   default String b() {
      return this.a().a();
   }

   default Optional<aug> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ald, aur<InputStream>> {
   }
}
