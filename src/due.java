import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class due implements dun, AutoCloseable {
   @Nullable
   public duk a(int $$0, int $$1, boolean $$2) {
      return (duk)this.a($$0, $$1, duz.n, $$2);
   }

   @Nullable
   public duk a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dum c(int $$0, int $$1) {
      return this.a($$0, $$1, duz.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, duz.n, false) != null;
   }

   @Nullable
   public abstract dua a(int var1, int var2, duz var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract enm p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(dbh $$0, boolean $$1) {
   }
}
