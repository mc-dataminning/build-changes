import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;

public class dqd extends dqk {
   private final dqb a;
   private final Path b;

   public dqd(dqi $$0, Path $$1, dqi $$2, Path $$3, DataFixer $$4, boolean $$5, ayc $$6) {
      super($$0, $$1, $$4, $$5, $$6);
      this.b = $$3;
      this.a = new dqb($$2, $$3, $$5);
   }

   @Override
   public CompletableFuture<Void> a(cwi $$0, @Nullable ta $$1) {
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
