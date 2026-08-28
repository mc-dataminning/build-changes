import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.apache.commons.io.FileUtils;

public class dyb extends dxy {
   private final dya a;
   private final Path b;

   public dyb(dyh $$0, Path $$1, dyh $$2, Path $$3, DataFixer $$4, boolean $$5) {
      super($$0, $$1, $$4, $$5);
      this.b = $$3;
      this.a = new dya($$2, $$3, $$5);
   }

   @Override
   public CompletableFuture<Void> a(ddp $$0, Supplier<ug> $$1) {
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
