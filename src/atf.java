import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface atf extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   aul<InputStream> a(String... var1);

   @Nullable
   aul<InputStream> a(ath var1, alc var2);

   void a(ath var1, String var2, String var3, atf.a var4);

   Set<String> a(ath var1);

   @Nullable
   <T> T a(ats<T> var1) throws IOException;

   ate a();

   default String b() {
      return this.a().a();
   }

   default Optional<aua> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<alc, aul<InputStream>> {
   }
}
