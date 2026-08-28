import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dzt implements eac, AutoCloseable {
   @Nullable
   public dzz a(int $$0, int $$1, boolean $$2) {
      return (dzz)this.a($$0, $$1, eaq.n, $$2);
   }

   @Nullable
   public dzz a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public eab c(int $$0, int $$1) {
      return this.a($$0, $$1, eaq.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, eaq.n, false) != null;
   }

   @Nullable
   public abstract dzp a(int var1, int var2, eaq var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract etl p();

   public void b(boolean $$0) {
   }

   public void a(dgn $$0, boolean $$1) {
   }
}
