import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface asg extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   atm<InputStream> a(String... var1);

   @Nullable
   atm<InputStream> a(asi var1, akk var2);

   void a(asi var1, String var2, String var3, asg.a var4);

   Set<String> a(asi var1);

   @Nullable
   <T> T a(ast<T> var1) throws IOException;

   asf a();

   default String b() {
      return this.a().a();
   }

   default Optional<atb> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<akk, atm<InputStream>> {
   }
}
