import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class ebp implements eby, AutoCloseable {
   @Nullable
   public ebv a(int $$0, int $$1, boolean $$2) {
      return (ebv)this.a($$0, $$1, ecm.n, $$2);
   }

   @Nullable
   public ebv a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public ebx c(int $$0, int $$1) {
      return this.a($$0, $$1, ecm.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, ecm.n, false) != null;
   }

   @Nullable
   public abstract ebl a(int var1, int var2, ecm var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract evk q();

   public void b(boolean $$0) {
   }

   public boolean a(dhw $$0, boolean $$1) {
      return false;
   }

   public LongSet k() {
      return LongSet.of();
   }
}
