import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ebl implements AutoCloseable {
   private final ebb a;
   private final DataFixer b;
   private final bbs c;

   public ebl(ebi $$0, Path $$1, DataFixer $$2, boolean $$3, bbs $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new ebb($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<ux>> a(dgn $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dgn $$0, @Nullable ux $$1) {
      return this.a.a($$0, $$1);
   }

   public ux a(ux $$0, int $$1) {
      int $$2 = vm.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<vu> a(Dynamic<vu> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public ebi a() {
      return this.a.a();
   }
}
