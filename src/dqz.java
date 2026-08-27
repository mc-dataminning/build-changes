import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dqz implements dri, AutoCloseable {
   @Nullable
   public drf a(int $$0, int $$1, boolean $$2) {
      return (drf)this.a($$0, $$1, dru.n, $$2);
   }

   @Nullable
   public drf a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public drh c(int $$0, int $$1) {
      return this.a($$0, $$1, dru.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dru.n, false) != null;
   }

   @Nullable
   public abstract dqv a(int var1, int var2, dru var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract ekh p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cye $$0, boolean $$1) {
   }
}
