import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dxn implements dxw, AutoCloseable {
   @Nullable
   public dxt a(int $$0, int $$1, boolean $$2) {
      return (dxt)this.a($$0, $$1, dyk.n, $$2);
   }

   @Nullable
   public dxt a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dxv c(int $$0, int $$1) {
      return this.a($$0, $$1, dyk.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dyk.n, false) != null;
   }

   @Nullable
   public abstract dxj a(int var1, int var2, dyk var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract erd p();

   public void b(boolean $$0) {
   }

   public void a(del $$0, boolean $$1) {
   }
}
