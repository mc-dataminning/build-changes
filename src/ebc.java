import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.apache.commons.io.FileUtils;

public class ebc extends eaz {
   private final ebb a;
   private final Path b;

   public ebc(ebi $$0, Path $$1, ebi $$2, Path $$3, DataFixer $$4, boolean $$5) {
      super($$0, $$1, $$4, $$5);
      this.b = $$3;
      this.a = new ebb($$2, $$3, $$5);
   }

   @Override
   public CompletableFuture<Void> a(dgn $$0, Supplier<ux> $$1) {
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
