import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dvs implements AutoCloseable {
   private final dvj a;
   private final DataFixer b;
   private final bag c;

   public dvs(dvq $$0, Path $$1, DataFixer $$2, boolean $$3, bag $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dvj($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<us>> a(dbh $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dbh $$0, @Nullable us $$1) {
      return this.a.a($$0, $$1);
   }

   public us a(us $$0, int $$1) {
      int $$2 = vh.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<vp> a(Dynamic<vp> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }
}
