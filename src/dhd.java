import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dhd implements dhn, AutoCloseable {
   @Nullable
   public dhk a(int $$0, int $$1, boolean $$2) {
      return (dhk)this.a($$0, $$1, dhe.n, $$2);
   }

   @Nullable
   public dhk a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dhm c(int $$0, int $$1) {
      return this.a($$0, $$1, dhe.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dhe.n, false) != null;
   }

   @Nullable
   public abstract dgz a(int var1, int var2, dhe var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract dzv p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cpi $$0, boolean $$1) {
   }
}
