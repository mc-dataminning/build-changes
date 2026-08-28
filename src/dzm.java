import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class dzm implements AutoCloseable {
   private final dzc a;
   private final DataFixer b;
   private final baw c;

   public dzm(dzj $$0, Path $$1, DataFixer $$2, boolean $$3, baw $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new dzc($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<ul>> a(des $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(des $$0, @Nullable ul $$1) {
      return this.a.a($$0, $$1);
   }

   public ul a(ul $$0, int $$1) {
      int $$2 = va.b($$0, $$1);
      return this.c.a(this.b, $$0, $$2);
   }

   public Dynamic<vi> a(Dynamic<vi> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public dzj a() {
      return this.a.a();
   }
}
