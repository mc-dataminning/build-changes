import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface ata extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   aug<InputStream> a(String... var1);

   @Nullable
   aug<InputStream> a(atc var1, ale var2);

   void a(atc var1, String var2, String var3, ata.a var4);

   Set<String> a(atc var1);

   @Nullable
   <T> T a(atn<T> var1) throws IOException;

   asz a();

   default String b() {
      return this.a().a();
   }

   default Optional<atv> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ale, aug<InputStream>> {
   }
}
