import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class eci implements ecr, AutoCloseable {
   @Nullable
   public eco a(int $$0, int $$1, boolean $$2) {
      return (eco)this.a($$0, $$1, edf.n, $$2);
   }

   @Nullable
   public eco a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public ecq c(int $$0, int $$1) {
      return this.a($$0, $$1, edf.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, edf.n, false) != null;
   }

   @Nullable
   public abstract ece a(int var1, int var2, edf var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   public abstract String e();

   public abstract int j();

   @Override
   public void close() throws IOException {
   }

   public abstract ewd q();

   public void b(boolean $$0) {
   }

   public boolean a(dih $$0, boolean $$1) {
      return false;
   }

   public LongSet k() {
      return LongSet.of();
   }
}
