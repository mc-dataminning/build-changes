import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dvo implements AutoCloseable {
   private final dvf a;
   private final DataFixer b;
   private final bae c;

   public dvo(dvm $$0, Path $$1, DataFixer $$2, boolean $$3, bae $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dvf($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<ur>> a(dbd $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dbd $$0, @Nullable ur $$1) {
      return this.a.a($$0, $$1);
   }

   public ur a(ur $$0, int $$1) {
      int $$2 = vg.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<vo> a(Dynamic<vo> $$0, int $$1) {
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
