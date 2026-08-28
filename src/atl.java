import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface atl extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   aur<InputStream> a(String... var1);

   @Nullable
   aur<InputStream> a(atn var1, alh var2);

   void a(atn var1, String var2, String var3, atl.a var4);

   Set<String> a(atn var1);

   @Nullable
   <T> T a(aty<T> var1) throws IOException;

   atk a();

   default String b() {
      return this.a().a();
   }

   default Optional<aug> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<alh, aur<InputStream>> {
   }
}
