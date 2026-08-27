import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dor implements AutoCloseable {
   private final doj a;
   private final DataFixer b;
   private final axo c;

   public dor(Path $$0, DataFixer $$1, boolean $$2, String $$3, axo $$4) {
      this.b = $$1;
      this.c = $$4;
      this.a = new doj($$0, $$2, $$3);
   }

   public CompletableFuture<Optional<sw>> a(cuy $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(cuy $$0, @Nullable sw $$1) {
      return this.a.a($$0, $$1);
   }

   public sw a(sw $$0, int $$1) {
      int $$2 = tl.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<tt> a(Dynamic<tt> $$0, int $$1) {
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
