import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dwu implements AutoCloseable {
   private final dwl a;
   private final DataFixer b;
   private final azw c;

   public dwu(dws $$0, Path $$1, DataFixer $$2, boolean $$3, azw $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dwl($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<ub>> a(dcd $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dcd $$0, @Nullable ub $$1) {
      return this.a.a($$0, $$1);
   }

   public ub a(ub $$0, int $$1) {
      int $$2 = uq.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<uy> a(Dynamic<uy> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public dws a() {
      return this.a.a();
   }
}
