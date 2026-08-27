import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface arq extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   asw<InputStream> a(String... var1);

   @Nullable
   asw<InputStream> a(ars var1, ajv var2);

   void a(ars var1, String var2, String var3, arq.a var4);

   Set<String> a(ars var1);

   @Nullable
   <T> T a(asd<T> var1) throws IOException;

   arp a();

   default String b() {
      return this.a().a();
   }

   default Optional<asl> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ajv, asw<InputStream>> {
   }
}
