import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface aqp extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   art<InputStream> a(String... var1);

   @Nullable
   art<InputStream> a(aqq var1, aiy var2);

   void a(aqq var1, String var2, String var3, aqp.a var4);

   Set<String> a(aqq var1);

   @Nullable
   <T> T a(arb<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<aiy, art<InputStream>> {
   }
}
