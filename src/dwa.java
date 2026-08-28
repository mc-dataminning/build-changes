import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dwa implements dwj, AutoCloseable {
   @Nullable
   public dwg a(int $$0, int $$1, boolean $$2) {
      return (dwg)this.a($$0, $$1, dwx.n, $$2);
   }

   @Nullable
   public dwg a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dwi c(int $$0, int $$1) {
      return this.a($$0, $$1, dwx.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dwx.n, false) != null;
   }

   @Nullable
   public abstract dvw a(int var1, int var2, dwx var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract epq p();

   public void b(boolean $$0) {
   }

   public void a(dcy $$0, boolean $$1) {
   }
}
