import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class djn implements djx, AutoCloseable {
   @Nullable
   public dju a(int $$0, int $$1, boolean $$2) {
      return (dju)this.a($$0, $$1, djo.n, $$2);
   }

   @Nullable
   public dju a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public djw c(int $$0, int $$1) {
      return this.a($$0, $$1, djo.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, djo.n, false) != null;
   }

   @Nullable
   public abstract djj a(int var1, int var2, djo var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract ecm p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(crm $$0, boolean $$1) {
   }
}
