import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;

public class dol extends dor {
   private final doj a;
   private final Path b;

   public dol(Path $$0, Path $$1, DataFixer $$2, boolean $$3, String $$4, axo $$5) {
      super($$0, $$2, $$3, $$4, $$5);
      this.b = $$1;
      this.a = new doj($$1, $$3, $$4 + "-recreating");
   }

   @Override
   public CompletableFuture<Void> a(cuy $$0, @Nullable sw $$1) {
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
