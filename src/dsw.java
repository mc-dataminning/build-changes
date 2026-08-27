import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dsw implements AutoCloseable {
   private final dsn a;
   private final DataFixer b;
   private final ays c;

   public dsw(dsu $$0, Path $$1, DataFixer $$2, boolean $$3, ays $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dsn($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<to>> a(cyn $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(cyn $$0, @Nullable to $$1) {
      return this.a.a($$0, $$1);
   }

   public to a(to $$0, int $$1) {
      int $$2 = ud.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<ul> a(Dynamic<ul> $$0, int $$1) {
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
