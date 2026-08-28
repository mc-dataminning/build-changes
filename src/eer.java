import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;

public class eer extends eez {
   private final eep a;
   private final Path b;

   public eer(eew $$0, Path $$1, eew $$2, Path $$3, DataFixer $$4, boolean $$5, bbf $$6) {
      super($$0, $$1, $$4, $$5, $$6);
      this.b = $$3;
      this.a = new eep($$2, $$3, $$5);
   }

   @Override
   public CompletableFuture<Void> a(dje $$0, @Nullable ua $$1) {
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
