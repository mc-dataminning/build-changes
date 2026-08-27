import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dtd implements dtm, AutoCloseable {
   @Nullable
   public dtj a(int $$0, int $$1, boolean $$2) {
      return (dtj)this.a($$0, $$1, dty.n, $$2);
   }

   @Nullable
   public dtj a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dtl c(int $$0, int $$1) {
      return this.a($$0, $$1, dty.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dty.n, false) != null;
   }

   @Nullable
   public abstract dsz a(int var1, int var2, dty var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract eml p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(dag $$0, boolean $$1) {
   }
}
