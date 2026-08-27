import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class diw implements djg, AutoCloseable {
   @Nullable
   public djd a(int $$0, int $$1, boolean $$2) {
      return (djd)this.a($$0, $$1, dix.n, $$2);
   }

   @Nullable
   public djd a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public djf c(int $$0, int $$1) {
      return this.a($$0, $$1, dix.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dix.n, false) != null;
   }

   @Nullable
   public abstract dis a(int var1, int var2, dix var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract ebv p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cqz $$0, boolean $$1) {
   }
}
