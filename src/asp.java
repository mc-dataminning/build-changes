import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface asp extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   atv<InputStream> a(String... var1);

   @Nullable
   atv<InputStream> a(asr var1, akt var2);

   void a(asr var1, String var2, String var3, asp.a var4);

   Set<String> a(asr var1);

   @Nullable
   <T> T a(atc<T> var1) throws IOException;

   aso a();

   default String b() {
      return this.a().a();
   }

   default Optional<atk> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<akt, atv<InputStream>> {
   }
}
