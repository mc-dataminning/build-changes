import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dlh implements dlr, AutoCloseable {
   @Nullable
   public dlo a(int $$0, int $$1, boolean $$2) {
      return (dlo)this.a($$0, $$1, dli.n, $$2);
   }

   @Nullable
   public dlo a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dlq c(int $$0, int $$1) {
      return this.a($$0, $$1, dli.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dli.n, false) != null;
   }

   @Nullable
   public abstract dld a(int var1, int var2, dli var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract eeg p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(csw $$0, boolean $$1) {
   }
}
