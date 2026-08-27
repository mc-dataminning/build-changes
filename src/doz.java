import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class doz implements dpj, AutoCloseable {
   @Nullable
   public dpg a(int $$0, int $$1, boolean $$2) {
      return (dpg)this.a($$0, $$1, dpa.n, $$2);
   }

   @Nullable
   public dpg a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dpi c(int $$0, int $$1) {
      return this.a($$0, $$1, dpa.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dpa.n, false) != null;
   }

   @Nullable
   public abstract dov a(int var1, int var2, dpa var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract eic p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cwg $$0, boolean $$1) {
   }
}
