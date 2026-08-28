import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class dub implements duk, AutoCloseable {
   @Nullable
   public duh a(int $$0, int $$1, boolean $$2) {
      return (duh)this.a($$0, $$1, duw.n, $$2);
   }

   @Nullable
   public duh a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public duj c(int $$0, int $$1) {
      return this.a($$0, $$1, duw.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, duw.n, false) != null;
   }

   @Nullable
   public abstract dtx a(int var1, int var2, duw var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract enj p();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(dbe $$0, boolean $$1) {
   }
}
