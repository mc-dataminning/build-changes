import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dzf implements AutoCloseable {
   private final dyv a;
   private final DataFixer b;
   private final bax c;

   public dzf(dzc $$0, Path $$1, DataFixer $$2, boolean $$3, bax $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dyv($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<un>> a(del $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(del $$0, @Nullable un $$1) {
      return this.a.a($$0, $$1);
   }

   public un a(un $$0, int $$1) {
      int $$2 = vc.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<vk> a(Dynamic<vk> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public dzc a() {
      return this.a.a();
   }
}
