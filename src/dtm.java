import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dtm implements AutoCloseable {
   private final dtd a;
   private final DataFixer b;
   private final azc c;

   public dtm(dtk $$0, Path $$1, DataFixer $$2, boolean $$3, azc $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dtd($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<ty>> a(czb $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(czb $$0, @Nullable ty $$1) {
      return this.a.a($$0, $$1);
   }

   public ty a(ty $$0, int $$1) {
      int $$2 = un.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<uv> a(Dynamic<uv> $$0, int $$1) {
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
