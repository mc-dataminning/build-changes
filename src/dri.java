import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dri implements drr, AutoCloseable {
   @Nullable
   public dro a(int $$0, int $$1, boolean $$2) {
      return (dro)this.a($$0, $$1, dsd.n, $$2);
   }

   @Nullable
   public dro a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public drq c(int $$0, int $$1) {
      return this.a($$0, $$1, dsd.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dsd.n, false) != null;
   }

   @Nullable
   public abstract dre a(int var1, int var2, dsd var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract ekq p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cyn $$0, boolean $$1) {
   }
}
