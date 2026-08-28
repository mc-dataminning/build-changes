import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface att extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   auz<InputStream> a(String... var1);

   @Nullable
   auz<InputStream> a(atv var1, alk var2);

   void a(atv var1, String var2, String var3, att.a var4);

   Set<String> a(atv var1);

   @Nullable
   <T> T a(aug<T> var1) throws IOException;

   ats a();

   default String b() {
      return this.a().a();
   }

   default Optional<aun> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<alk, auz<InputStream>> {
   }
}
