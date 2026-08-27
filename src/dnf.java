import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dnf implements dnp, AutoCloseable {
   @Nullable
   public dnm a(int $$0, int $$1, boolean $$2) {
      return (dnm)this.a($$0, $$1, dng.n, $$2);
   }

   @Nullable
   public dnm a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dno c(int $$0, int $$1) {
      return this.a($$0, $$1, dng.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dng.n, false) != null;
   }

   @Nullable
   public abstract dnb a(int var1, int var2, dng var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract ege p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cuu $$0, boolean $$1) {
   }
}
