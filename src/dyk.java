import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dyk implements AutoCloseable {
   private final dya a;
   private final DataFixer b;
   private final bao c;

   public dyk(dyh $$0, Path $$1, DataFixer $$2, boolean $$3, bao $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dya($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<ug>> a(ddp $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(ddp $$0, @Nullable ug $$1) {
      return this.a.a($$0, $$1);
   }

   public ug a(ug $$0, int $$1) {
      int $$2 = uv.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<vd> a(Dynamic<vd> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public dyh a() {
      return this.a.a();
   }
}
