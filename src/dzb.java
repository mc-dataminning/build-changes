import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dzb implements AutoCloseable {
   private final dyr a;
   private final DataFixer b;
   private final bat c;

   public dzb(dyy $$0, Path $$1, DataFixer $$2, boolean $$3, bat $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dyr($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<uk>> a(deh $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(deh $$0, @Nullable uk $$1) {
      return this.a.a($$0, $$1);
   }

   public uk a(uk $$0, int $$1) {
      int $$2 = uz.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<vh> a(Dynamic<vh> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public dyy a() {
      return this.a.a();
   }
}
