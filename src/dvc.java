import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dvc implements dvl, AutoCloseable {
   @Nullable
   public dvi a(int $$0, int $$1, boolean $$2) {
      return (dvi)this.a($$0, $$1, dvx.n, $$2);
   }

   @Nullable
   public dvi a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dvk c(int $$0, int $$1) {
      return this.a($$0, $$1, dvx.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dvx.n, false) != null;
   }

   @Nullable
   public abstract duy a(int var1, int var2, dvx var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract eot p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(dbh $$0, boolean $$1) {
   }
}
