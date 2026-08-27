import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dgz implements dhj, AutoCloseable {
   @Nullable
   public dhg a(int $$0, int $$1, boolean $$2) {
      return (dhg)this.a($$0, $$1, dha.n, $$2);
   }

   @Nullable
   public dhg a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dhi c(int $$0, int $$1) {
      return this.a($$0, $$1, dha.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dha.n, false) != null;
   }

   @Nullable
   public abstract dgv a(int var1, int var2, dha var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract dzr p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cos $$0, boolean $$1) {
   }
}
