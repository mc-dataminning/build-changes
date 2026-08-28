import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.apache.commons.io.FileUtils;

public class efa extends eex {
   private final eez a;
   private final Path b;

   public efa(efg $$0, Path $$1, efg $$2, Path $$3, DataFixer $$4, boolean $$5) {
      super($$0, $$1, $$4, $$5);
      this.b = $$3;
      this.a = new eez($$2, $$3, $$5);
   }

   @Override
   public CompletableFuture<Void> a(djo $$0, Supplier<ua> $$1) {
      this.e($$0);
      return this.a.a($$0, $$1);
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.a.close();
      if (this.b.toFile().exists()) {
         FileUtils.deleteDirectory(this.b.toFile());
      }
   }
}
