import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dyv implements AutoCloseable {
   private final dyl a;
   private final DataFixer b;
   private final bas c;

   public dyv(dys $$0, Path $$1, DataFixer $$2, boolean $$3, bas $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dyl($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<uj>> a(deb $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(deb $$0, @Nullable uj $$1) {
      return this.a.a($$0, $$1);
   }

   public uj a(uj $$0, int $$1) {
      int $$2 = uy.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<vg> a(Dynamic<vg> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public dys a() {
      return this.a.a();
   }
}
