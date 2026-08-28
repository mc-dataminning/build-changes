import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ebf implements AutoCloseable {
   private final eav a;
   private final DataFixer b;
   private final bbi c;

   public ebf(ebc $$0, Path $$1, DataFixer $$2, boolean $$3, bbi $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new eav($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<um>> a(dgf $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dgf $$0, @Nullable um $$1) {
      return this.a.a($$0, $$1);
   }

   public um a(um $$0, int $$1) {
      int $$2 = vb.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<vj> a(Dynamic<vj> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public ebc a() {
      return this.a.a();
   }
}
