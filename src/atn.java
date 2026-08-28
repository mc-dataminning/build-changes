import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface atn extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   aus<InputStream> a(String... var1);

   @Nullable
   aus<InputStream> a(atp var1, ale var2);

   void a(atp var1, String var2, String var3, atn.a var4);

   Set<String> a(atp var1);

   @Nullable
   <T> T a(aua<T> var1) throws IOException;

   atm a();

   default String b() {
      return this.a().a();
   }

   default Optional<auh> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ale, aus<InputStream>> {
   }
}
