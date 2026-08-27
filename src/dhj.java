import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dhj implements dht, AutoCloseable {
   @Nullable
   public dhq a(int $$0, int $$1, boolean $$2) {
      return (dhq)this.a($$0, $$1, dhk.n, $$2);
   }

   @Nullable
   public dhq a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dhs c(int $$0, int $$1) {
      return this.a($$0, $$1, dhk.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dhk.n, false) != null;
   }

   @Nullable
   public abstract dhf a(int var1, int var2, dhk var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract eab p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cpc $$0, boolean $$1) {
   }
}
