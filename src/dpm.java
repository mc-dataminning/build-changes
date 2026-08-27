import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dpm implements AutoCloseable {
   private final dpe a;
   private final DataFixer b;
   private final axs c;

   public dpm(Path $$0, DataFixer $$1, boolean $$2, String $$3, axs $$4) {
      this.b = $$1;
      this.c = $$4;
      this.a = new dpe($$0, $$2, $$3);
   }

   public CompletableFuture<Optional<sy>> a(cvl $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(cvl $$0, @Nullable sy $$1) {
      return this.a.a($$0, $$1);
   }

   public sy a(sy $$0, int $$1) {
      int $$2 = tn.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<tv> a(Dynamic<tv> $$0, int $$1) {
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
