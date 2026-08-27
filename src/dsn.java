import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dsn implements AutoCloseable {
   private final dse a;
   private final DataFixer b;
   private final ayq c;

   public dsn(dsl $$0, Path $$1, DataFixer $$2, boolean $$3, ayq $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dse($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<tm>> a(cye $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(cye $$0, @Nullable tm $$1) {
      return this.a.a($$0, $$1);
   }

   public tm a(tm $$0, int $$1) {
      int $$2 = ub.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<uj> a(Dynamic<uj> $$0, int $$1) {
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
