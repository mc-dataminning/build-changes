import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;

public class dve extends dvl {
   private final dvc a;
   private final Path b;

   public dve(dvj $$0, Path $$1, dvj $$2, Path $$3, DataFixer $$4, boolean $$5, bab $$6) {
      super($$0, $$1, $$4, $$5, $$6);
      this.b = $$3;
      this.a = new dvc($$2, $$3, $$5);
   }

   @Override
   public CompletableFuture<Void> a(dba $$0, @Nullable ur $$1) {
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
