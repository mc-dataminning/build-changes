import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface aoq extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   apu<InputStream> a(String... var1);

   @Nullable
   apu<InputStream> a(aor var1, ahd var2);

   void a(aor var1, String var2, String var3, aoq.a var4);

   Set<String> a(aor var1);

   @Nullable
   <T> T a(apc<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ahd, apu<InputStream>> {
   }
}
