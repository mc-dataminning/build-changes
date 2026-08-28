import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class eao implements AutoCloseable {
   private final eae a;
   private final DataFixer b;
   private final ban c;

   public eao(eal $$0, Path $$1, DataFixer $$2, boolean $$3, ban $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new eae($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<tq>> a(dfo $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dfo $$0, @Nullable tq $$1) {
      return this.a.a($$0, $$1);
   }

   public tq a(tq $$0, int $$1) {
      int $$2 = uf.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<un> a(Dynamic<un> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public eal a() {
      return this.a.a();
   }
}
