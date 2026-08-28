import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dxs implements AutoCloseable {
   private final dxi a;
   private final DataFixer b;
   private final bal c;

   public dxs(dxp $$0, Path $$1, DataFixer $$2, boolean $$3, bal $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dxi($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<uf>> a(dcy $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dcy $$0, @Nullable uf $$1) {
      return this.a.a($$0, $$1);
   }

   public uf a(uf $$0, int $$1) {
      int $$2 = uu.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<vc> a(Dynamic<vc> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public dxp a() {
      return this.a.a();
   }
}
