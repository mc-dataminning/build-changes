import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface ara extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   asg<InputStream> a(String... var1);

   @Nullable
   asg<InputStream> a(arc var1, ajh var2);

   void a(arc var1, String var2, String var3, ara.a var4);

   Set<String> a(arc var1);

   @Nullable
   <T> T a(arn<T> var1) throws IOException;

   aqz a();

   default String b() {
      return this.a().a();
   }

   default Optional<arv> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ajh, asg<InputStream>> {
   }
}
