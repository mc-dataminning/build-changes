import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dnj implements dnt, AutoCloseable {
   @Nullable
   public dnq a(int $$0, int $$1, boolean $$2) {
      return (dnq)this.a($$0, $$1, dnk.n, $$2);
   }

   @Nullable
   public dnq a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public dns c(int $$0, int $$1) {
      return this.a($$0, $$1, dnk.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, dnk.n, false) != null;
   }

   @Nullable
   public abstract dnf a(int var1, int var2, dnk var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract egl p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cuy $$0, boolean $$1) {
   }
}
