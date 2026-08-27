import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dlp implements dlz, AutoCloseable {
   @Nullable
   public dlw a(int $$0, int $$1, boolean $$2) {
      return (dlw)this.a($$0, $$1, dlq.n, $$2);
   }

   @Nullable
   public dlw a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dly c(int $$0, int $$1) {
      return this.a($$0, $$1, dlq.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dlq.n, false) != null;
   }

   @Nullable
   public abstract dll a(int var1, int var2, dlq var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract eeo p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cte $$0, boolean $$1) {
   }
}
