import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface asx extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   aud<InputStream> a(String... var1);

   @Nullable
   aud<InputStream> a(asz var1, alb var2);

   void a(asz var1, String var2, String var3, asx.a var4);

   Set<String> a(asz var1);

   @Nullable
   <T> T a(atk<T> var1) throws IOException;

   asw a();

   default String b() {
      return this.a().a();
   }

   default Optional<ats> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<alb, aud<InputStream>> {
   }
}
