import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.io.FileUtils;

public class dok extends doh {
   private final doj a;
   private final Path b;

   public dok(Path $$0, Path $$1, DataFixer $$2, boolean $$3) {
      super($$0, $$2, $$3);
      this.b = $$1;
      this.a = new doj($$1, $$3, "chunk-recreating");
   }

   @Override
   public CompletableFuture<Void> a(cuy $$0, sw $$1) {
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
