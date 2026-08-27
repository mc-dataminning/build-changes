import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.io.FileUtils;

public class dpf extends dpc {
   private final dpe a;
   private final Path b;

   public dpf(Path $$0, Path $$1, DataFixer $$2, boolean $$3) {
      super($$0, $$2, $$3);
      this.b = $$1;
      this.a = new dpe($$1, $$3, "chunk-recreating");
   }

   @Override
   public CompletableFuture<Void> a(cvl $$0, sy $$1) {
      this.f($$0);
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
