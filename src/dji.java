import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dji implements djs, AutoCloseable {
   @Nullable
   public djp a(int $$0, int $$1, boolean $$2) {
      return (djp)this.a($$0, $$1, djj.n, $$2);
   }

   @Nullable
   public djp a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public djr c(int $$0, int $$1) {
      return this.a($$0, $$1, djj.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, djj.n, false) != null;
   }

   @Nullable
   public abstract dje a(int var1, int var2, djj var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract ech p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(crh $$0, boolean $$1) {
   }
}
