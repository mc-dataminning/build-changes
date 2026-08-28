import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class duk implements dut, AutoCloseable {
   @Nullable
   public duq a(int $$0, int $$1, boolean $$2) {
      return (duq)this.a($$0, $$1, dvh.n, $$2);
   }

   @Nullable
   public duq a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dus c(int $$0, int $$1) {
      return this.a($$0, $$1, dvh.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dvh.n, false) != null;
   }

   @Nullable
   public abstract dug a(int var1, int var2, dvh var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract enw p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(dbm $$0, boolean $$1) {
   }
}
