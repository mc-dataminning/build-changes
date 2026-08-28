import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dva implements dvj, AutoCloseable {
   @Nullable
   public dvg a(int $$0, int $$1, boolean $$2) {
      return (dvg)this.a($$0, $$1, dvx.n, $$2);
   }

   @Nullable
   public dvg a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dvi c(int $$0, int $$1) {
      return this.a($$0, $$1, dvx.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dvx.n, false) != null;
   }

   @Nullable
   public abstract duw a(int var1, int var2, dvx var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract eon p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(dcb $$0, boolean $$1) {
   }
}
