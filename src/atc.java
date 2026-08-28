import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface atc extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   auh<InputStream> a(String... var1);

   @Nullable
   auh<InputStream> a(ate var1, aku var2);

   void a(ate var1, String var2, String var3, atc.a var4);

   Set<String> a(ate var1);

   @Nullable
   <T> T a(atp<T> var1) throws IOException;

   atb a();

   default String b() {
      return this.a().a();
   }

   default Optional<atw> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<aku, auh<InputStream>> {
   }
}
