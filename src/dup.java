import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dup implements AutoCloseable {
   private final dug a;
   private final DataFixer b;
   private final azj c;

   public dup(dun $$0, Path $$1, DataFixer $$2, boolean $$3, azj $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dug($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<ud>> a(dae $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dae $$0, @Nullable ud $$1) {
      return this.a.a($$0, $$1);
   }

   public ud a(ud $$0, int $$1) {
      int $$2 = us.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<va> a(Dynamic<va> $$0, int $$1) {
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
