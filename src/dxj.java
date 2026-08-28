import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dxj implements dxs, AutoCloseable {
   @Nullable
   public dxp a(int $$0, int $$1, boolean $$2) {
      return (dxp)this.a($$0, $$1, dyg.n, $$2);
   }

   @Nullable
   public dxp a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dxr c(int $$0, int $$1) {
      return this.a($$0, $$1, dyg.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dyg.n, false) != null;
   }

   @Nullable
   public abstract dxf a(int var1, int var2, dyg var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract eqz p();

   public void b(boolean $$0) {
   }

   public void a(deh $$0, boolean $$1) {
   }
}
