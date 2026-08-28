import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class eea implements AutoCloseable {
   private final edq a;
   private final DataFixer b;
   private final bbb c;

   public eea(edx $$0, Path $$1, DataFixer $$2, boolean $$3, bbb $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new edq($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<tz>> a(dih $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dih $$0, @Nullable tz $$1) {
      return this.a.a($$0, $$1);
   }

   public tz a(tz $$0, int $$1) {
      int $$2 = uo.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<uw> a(Dynamic<uw> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public edx a() {
      return this.a.a();
   }
}
