import it.unimi.dsi.fastutil.HashCommon;
import org.jetbrains.annotations.Nullable;

public class elk {
   private static final int a = 4096;
   private static final int b = 4095;
   private final long[] c = new long[4096];
   private final elj[] d = new elj[4096];

   public elj a(cyd $$0, ib $$1) {
      long $$2 = $$1.a();
      int $$3 = a($$2);
      elj $$4 = this.a($$3, $$2);
      return $$4 != null ? $$4 : this.a($$0, $$1, $$3, $$2);
   }

   @Nullable
   private elj a(int $$0, long $$1) {
      return this.c[$$0] == $$1 ? this.d[$$0] : null;
   }

   private elj a(cyd $$0, ib $$1, int $$2, long $$3) {
      elj $$4 = elo.b($$0, $$1);
      this.c[$$2] = $$3;
      this.d[$$2] = $$4;
      return $$4;
   }

   public void a(ib $$0) {
      long $$1 = $$0.a();
      int $$2 = a($$1);
      if (this.c[$$2] == $$1) {
         this.d[$$2] = null;
      }
   }

   private static int a(long $$0) {
      return (int)HashCommon.mix($$0) & 4095;
   }
}
