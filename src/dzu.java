import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dzu implements ead, AutoCloseable {
   @Nullable
   public eaa a(int $$0, int $$1, boolean $$2) {
      return (eaa)this.a($$0, $$1, ear.n, $$2);
   }

   @Nullable
   public eaa a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public eac c(int $$0, int $$1) {
      return this.a($$0, $$1, ear.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, ear.n, false) != null;
   }

   @Nullable
   public abstract dzq a(int var1, int var2, ear var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract etm p();

   public void b(boolean $$0) {
   }

   public void a(dgo $$0, boolean $$1) {
   }
}
