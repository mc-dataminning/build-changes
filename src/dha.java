import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dha implements dhk, AutoCloseable {
   @Nullable
   public dhh a(int $$0, int $$1, boolean $$2) {
      return (dhh)this.a($$0, $$1, dhb.n, $$2);
   }

   @Nullable
   public dhh a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dhj c(int $$0, int $$1) {
      return this.a($$0, $$1, dhb.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dhb.n, false) != null;
   }

   @Nullable
   public abstract dgw a(int var1, int var2, dhb var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract dzs p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cot $$0, boolean $$1) {
   }
}
