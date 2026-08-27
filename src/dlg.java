import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dlg implements dlq, AutoCloseable {
   @Nullable
   public dln a(int $$0, int $$1, boolean $$2) {
      return (dln)this.a($$0, $$1, dlh.n, $$2);
   }

   @Nullable
   public dln a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dlp c(int $$0, int $$1) {
      return this.a($$0, $$1, dlh.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dlh.n, false) != null;
   }

   @Nullable
   public abstract dlc a(int var1, int var2, dlh var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract eef p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(csv $$0, boolean $$1) {
   }
}
