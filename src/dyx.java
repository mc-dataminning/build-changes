import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dyx implements dzg, AutoCloseable {
   @Nullable
   public dzd a(int $$0, int $$1, boolean $$2) {
      return (dzd)this.a($$0, $$1, dzu.n, $$2);
   }

   @Nullable
   public dzd a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dzf c(int $$0, int $$1) {
      return this.a($$0, $$1, dzu.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dzu.n, false) != null;
   }

   @Nullable
   public abstract dyt a(int var1, int var2, dzu var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract esp p();

   public void b(boolean $$0) {
   }

   public void a(dfp $$0, boolean $$1) {
   }
}
