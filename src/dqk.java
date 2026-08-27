import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dqk implements AutoCloseable {
   private final dqb a;
   private final DataFixer b;
   private final ayc c;

   public dqk(dqi $$0, Path $$1, DataFixer $$2, boolean $$3, ayc $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dqb($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<ta>> a(cwi $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(cwi $$0, @Nullable ta $$1) {
      return this.a.a($$0, $$1);
   }

   public ta a(ta $$0, int $$1) {
      int $$2 = tp.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<tx> a(Dynamic<tx> $$0, int $$1) {
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
