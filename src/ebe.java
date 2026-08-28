import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ebe implements AutoCloseable {
   private final eau a;
   private final DataFixer b;
   private final bbo c;

   public ebe(ebb $$0, Path $$1, DataFixer $$2, boolean $$3, bbo $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new eau($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<ux>> a(dgg $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dgg $$0, @Nullable ux $$1) {
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

   public ebb a() {
      return this.a.a();
   }
}
