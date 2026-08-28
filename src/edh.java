import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class edh implements AutoCloseable {
   private final ecx a;
   private final DataFixer b;
   private final baz c;

   public edh(ede $$0, Path $$1, DataFixer $$2, boolean $$3, baz $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new ecx($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<tx>> a(dhw $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dhw $$0, @Nullable tx $$1) {
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

   public ede a() {
      return this.a.a();
   }
}
