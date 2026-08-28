import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;

public class dxy extends dyg {
   private final dxw a;
   private final Path b;

   public dxy(dyd $$0, Path $$1, dyd $$2, Path $$3, DataFixer $$4, boolean $$5, bam $$6) {
      super($$0, $$1, $$4, $$5, $$6);
      this.b = $$3;
      this.a = new dxw($$2, $$3, $$5);
   }

   @Override
   public CompletableFuture<Void> a(ddm $$0, @Nullable uf $$1) {
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
