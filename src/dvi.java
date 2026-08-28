import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;

public class dvi extends dvp {
   private final dvg a;
   private final Path b;

   public dvi(dvn $$0, Path $$1, dvn $$2, Path $$3, DataFixer $$4, boolean $$5, baf $$6) {
      super($$0, $$1, $$4, $$5, $$6);
      this.b = $$3;
      this.a = new dvg($$2, $$3, $$5);
   }

   @Override
   public CompletableFuture<Void> a(dbe $$0, @Nullable ur $$1) {
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
