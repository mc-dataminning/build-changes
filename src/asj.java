import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface asj extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   atp<InputStream> a(String... var1);

   @Nullable
   atp<InputStream> a(asl var1, akn var2);

   void a(asl var1, String var2, String var3, asj.a var4);

   Set<String> a(asl var1);

   @Nullable
   <T> T a(asw<T> var1) throws IOException;

   asi a();

   default String b() {
      return this.a().a();
   }

   default Optional<ate> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<akn, atp<InputStream>> {
   }
}
