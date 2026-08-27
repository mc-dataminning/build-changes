import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dgy implements dhi, AutoCloseable {
   @Nullable
   public dhf a(int $$0, int $$1, boolean $$2) {
      return (dhf)this.a($$0, $$1, dgz.n, $$2);
   }

   @Nullable
   public dhf a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dhh c(int $$0, int $$1) {
      return this.a($$0, $$1, dgz.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dgz.n, false) != null;
   }

   @Nullable
   public abstract dgu a(int var1, int var2, dgz var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract dzq p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cor $$0, boolean $$1) {
   }
}
