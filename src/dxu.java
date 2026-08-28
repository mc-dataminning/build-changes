import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dxu implements dyd, AutoCloseable {
   @Nullable
   public dya a(int $$0, int $$1, boolean $$2) {
      return (dya)this.a($$0, $$1, dyr.n, $$2);
   }

   @Nullable
   public dya a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dyc c(int $$0, int $$1) {
      return this.a($$0, $$1, dyr.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dyr.n, false) != null;
   }

   @Nullable
   public abstract dxq a(int var1, int var2, dyr var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract erk p();

   public void b(boolean $$0) {
   }

   public void a(des $$0, boolean $$1) {
   }
}
