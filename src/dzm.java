import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dzm implements dzv, AutoCloseable {
   @Nullable
   public dzs a(int $$0, int $$1, boolean $$2) {
      return (dzs)this.a($$0, $$1, eaj.n, $$2);
   }

   @Nullable
   public dzs a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dzu c(int $$0, int $$1) {
      return this.a($$0, $$1, eaj.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, eaj.n, false) != null;
   }

   @Nullable
   public abstract dzi a(int var1, int var2, eaj var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract ete p();

   public void b(boolean $$0) {
   }

   public void a(dgg $$0, boolean $$1) {
   }
}
