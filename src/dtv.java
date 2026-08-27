import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dtv implements AutoCloseable {
   private final dtm a;
   private final DataFixer b;
   private final azf c;

   public dtv(dtt $$0, Path $$1, DataFixer $$2, boolean $$3, azf $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dtm($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<ua>> a(czk $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(czk $$0, @Nullable ua $$1) {
      return this.a.a($$0, $$1);
   }

   public ua a(ua $$0, int $$1) {
      int $$2 = up.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<ux> a(Dynamic<ux> $$0, int $$1) {
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
