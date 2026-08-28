import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;

public class eaw extends ebe {
   private final eau a;
   private final Path b;

   public eaw(ebb $$0, Path $$1, ebb $$2, Path $$3, DataFixer $$4, boolean $$5, bbo $$6) {
      super($$0, $$1, $$4, $$5, $$6);
      this.b = $$3;
      this.a = new eau($$2, $$3, $$5);
   }

   @Override
   public CompletableFuture<Void> a(dgg $$0, @Nullable ux $$1) {
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
