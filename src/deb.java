import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class deb implements del, AutoCloseable {
   @Nullable
   public dei a(int $$0, int $$1, boolean $$2) {
      return (dei)this.a($$0, $$1, dec.n, $$2);
   }

   @Nullable
   public dei a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dek c(int $$0, int $$1) {
      return this.a($$0, $$1, dec.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dec.n, false) != null;
   }

   @Nullable
   public abstract ddx a(int var1, int var2, dec var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract dwt p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(clt $$0, boolean $$1) {
   }
}
