import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ecf implements AutoCloseable {
   private final ebv a;
   private final DataFixer b;
   private final bax c;

   public ecf(ecc $$0, Path $$1, DataFixer $$2, boolean $$3, bax $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new ebv($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<tw>> a(dgw $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dgw $$0, @Nullable tw $$1) {
      return this.a.a($$0, $$1);
   }

   public tw a(tw $$0, int $$1) {
      int $$2 = ul.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<ut> a(Dynamic<ut> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public ecc a() {
      return this.a.a();
   }
}
