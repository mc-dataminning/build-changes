import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class doe implements doo, AutoCloseable {
   @Nullable
   public dol a(int $$0, int $$1, boolean $$2) {
      return (dol)this.a($$0, $$1, dof.n, $$2);
   }

   @Nullable
   public dol a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public don c(int $$0, int $$1) {
      return this.a($$0, $$1, dof.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dof.n, false) != null;
   }

   @Nullable
   public abstract doa a(int var1, int var2, dof var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract ehg p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cvl $$0, boolean $$1) {
   }
}
