import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface amk extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   ano<InputStream> a(String... var1);

   @Nullable
   ano<InputStream> a(aml var1, aez var2);

   void a(aml var1, String var2, String var3, amk.a var4);

   Set<String> a(aml var1);

   @Nullable
   <T> T a(amw<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<aez, ano<InputStream>> {
   }
}
