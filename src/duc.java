import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class duc implements dul, AutoCloseable {
   @Nullable
   public dui a(int $$0, int $$1, boolean $$2) {
      return (dui)this.a($$0, $$1, dux.n, $$2);
   }

   @Nullable
   public dui a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public duk c(int $$0, int $$1) {
      return this.a($$0, $$1, dux.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dux.n, false) != null;
   }

   @Nullable
   public abstract dty a(int var1, int var2, dux var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract enk p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(dbf $$0, boolean $$1) {
   }
}
