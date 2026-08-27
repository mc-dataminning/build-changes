import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dtb implements dtk, AutoCloseable {
   @Nullable
   public dth a(int $$0, int $$1, boolean $$2) {
      return (dth)this.a($$0, $$1, dtw.n, $$2);
   }

   @Nullable
   public dth a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dtj c(int $$0, int $$1) {
      return this.a($$0, $$1, dtw.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dtw.n, false) != null;
   }

   @Nullable
   public abstract dsx a(int var1, int var2, dtw var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract emj p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(dae $$0, boolean $$1) {
   }
}
