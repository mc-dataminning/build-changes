import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dul implements duu, AutoCloseable {
   @Nullable
   public dur a(int $$0, int $$1, boolean $$2) {
      return (dur)this.a($$0, $$1, dvi.n, $$2);
   }

   @Nullable
   public dur a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dut c(int $$0, int $$1) {
      return this.a($$0, $$1, dvi.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dvi.n, false) != null;
   }

   @Nullable
   public abstract duh a(int var1, int var2, dvi var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract eny p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(dbn $$0, boolean $$1) {
   }
}
