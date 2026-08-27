import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dsh implements dsq, AutoCloseable {
   @Nullable
   public dsn a(int $$0, int $$1, boolean $$2) {
      return (dsn)this.a($$0, $$1, dtc.n, $$2);
   }

   @Nullable
   public dsn a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dsp c(int $$0, int $$1) {
      return this.a($$0, $$1, dtc.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dtc.n, false) != null;
   }

   @Nullable
   public abstract dsd a(int var1, int var2, dtc var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract elp p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(czk $$0, boolean $$1) {
   }
}
