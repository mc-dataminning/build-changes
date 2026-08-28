import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class edf implements edo, AutoCloseable {
   @Nullable
   public edl a(int $$0, int $$1, boolean $$2) {
      return (edl)this.a($$0, $$1, eec.n, $$2);
   }

   @Nullable
   public edl a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public edn c(int $$0, int $$1) {
      return this.a($$0, $$1, eec.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, eec.n, false) != null;
   }

   @Nullable
   public abstract edb a(int var1, int var2, eec var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract exd q();

   public void b(boolean $$0) {
   }

   public boolean a(djc $$0, boolean $$1) {
      return false;
   }

   public LongSet k() {
      return LongSet.of();
   }
}
