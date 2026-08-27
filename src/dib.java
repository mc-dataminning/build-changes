import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dib implements dil, AutoCloseable {
   @Nullable
   public dii a(int $$0, int $$1, boolean $$2) {
      return (dii)this.a($$0, $$1, dic.n, $$2);
   }

   @Nullable
   public dii a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dik c(int $$0, int $$1) {
      return this.a($$0, $$1, dic.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dic.n, false) != null;
   }

   @Nullable
   public abstract dhx a(int var1, int var2, dic var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract eat p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cqg $$0, boolean $$1) {
   }
}
