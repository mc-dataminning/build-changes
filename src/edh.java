import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class edh implements edq, AutoCloseable {
   @Nullable
   public edn a(int $$0, int $$1, boolean $$2) {
      return (edn)this.a($$0, $$1, eee.n, $$2);
   }

   @Nullable
   public edn a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public edp c(int $$0, int $$1) {
      return this.a($$0, $$1, eee.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, eee.n, false) != null;
   }

   @Nullable
   public abstract edd a(int var1, int var2, eee var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract exf q();

   public void b(boolean $$0) {
   }

   public boolean a(dje $$0, boolean $$1) {
      return false;
   }

   public LongSet k() {
      return LongSet.of();
   }
}
