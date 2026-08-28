import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface atb extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   aug<InputStream> a(String... var1);

   @Nullable
   aug<InputStream> a(atd var1, aku var2);

   void a(atd var1, String var2, String var3, atb.a var4);

   Set<String> a(atd var1);

   @Nullable
   <T> T a(ato<T> var1) throws IOException;

   ata a();

   default String b() {
      return this.a().a();
   }

   default Optional<atv> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<aku, aug<InputStream>> {
   }
}
