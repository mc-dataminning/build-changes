import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class duh implements duq, AutoCloseable {
   @Nullable
   public dun a(int $$0, int $$1, boolean $$2) {
      return (dun)this.a($$0, $$1, dvc.n, $$2);
   }

   @Nullable
   public dun a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dup c(int $$0, int $$1) {
      return this.a($$0, $$1, dvc.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dvc.n, false) != null;
   }

   @Nullable
   public abstract dud a(int var1, int var2, dvc var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract enq p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(dbk $$0, boolean $$1) {
   }
}
