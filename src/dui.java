import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;

public class dui extends dup {
   private final dug a;
   private final Path b;

   public dui(dun $$0, Path $$1, dun $$2, Path $$3, DataFixer $$4, boolean $$5, azj $$6) {
      super($$0, $$1, $$4, $$5, $$6);
      this.b = $$3;
      this.a = new dug($$2, $$3, $$5);
   }

   @Override
   public CompletableFuture<Void> a(dae $$0, @Nullable ud $$1) {
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
