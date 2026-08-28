import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dwo implements dwx, AutoCloseable {
   @Nullable
   public dwu a(int $$0, int $$1, boolean $$2) {
      return (dwu)this.a($$0, $$1, dxl.n, $$2);
   }

   @Nullable
   public dwu a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dww c(int $$0, int $$1) {
      return this.a($$0, $$1, dxl.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dxl.n, false) != null;
   }

   @Nullable
   public abstract dwk a(int var1, int var2, dxl var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract eqe p();

   public void b(boolean $$0) {
   }

   public void a(ddm $$0, boolean $$1) {
   }
}
