import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dla implements dlk, AutoCloseable {
   @Nullable
   public dlh a(int $$0, int $$1, boolean $$2) {
      return (dlh)this.a($$0, $$1, dlb.n, $$2);
   }

   @Nullable
   public dlh a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dlj c(int $$0, int $$1) {
      return this.a($$0, $$1, dlb.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dlb.n, false) != null;
   }

   @Nullable
   public abstract dkw a(int var1, int var2, dlb var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract edz p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(csp $$0, boolean $$1) {
   }
}
