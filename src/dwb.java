import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dwb implements AutoCloseable {
   private final dvs a;
   private final DataFixer b;
   private final azo c;

   public dwb(dvz $$0, Path $$1, DataFixer $$2, boolean $$3, azo $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dvs($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<tx>> a(dbm $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dbm $$0, @Nullable tx $$1) {
      return this.a.a($$0, $$1);
   }

   public tx a(tx $$0, int $$1) {
      int $$2 = um.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<uu> a(Dynamic<uu> $$0, int $$1) {
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
