import com.google.common.annotations.VisibleForTesting;
import java.util.concurrent.atomic.AtomicLong;

public class dxt implements dxh {
   private static final int d = 48;
   private static final long e = 281474976710655L;
   private static final long f = 25214903917L;
   private static final long g = 11L;
   private final AtomicLong h = new AtomicLong();
   private final dxu i = new dxu(this);

   public dxt(long $$0) {
      this.b($$0);
   }

   @Override
   public azf d() {
      return new dxt(this.g());
   }

   @Override
   public dyf e() {
      return new dxt.a(this.g());
   }

   @Override
   public void b(long $$0) {
      if (!this.h.compareAndSet(this.h.get(), ($$0 ^ 25214903917L) & 281474976710655L)) {
         throw azv.a("LegacyRandomSource", null);
      } else {
         this.i.a();
      }
   }

   @Override
   public int c(int $$0) {
      long $$1 = this.h.get();
      long $$2 = $$1 * 25214903917L + 11L & 281474976710655L;
      if (!this.h.compareAndSet($$1, $$2)) {
         throw azv.a("LegacyRandomSource", null);
      } else {
         return (int)($$2 >> 48 - $$0);
      }
   }

   @Override
   public double k() {
      return this.i.b();
   }

   public static class a implements dyf {
      private final long a;

      public a(long $$0) {
         this.a = $$0;
      }

      @Override
      public azf a(int $$0, int $$1, int $$2) {
         long $$3 = ayx.b($$0, $$1, $$2);
         long $$4 = $$3 ^ this.a;
         return new dxt($$4);
      }

      @Override
      public azf a(String $$0) {
         int $$1 = $$0.hashCode();
         return new dxt((long)$$1 ^ this.a);
      }

      @VisibleForTesting
      @Override
      public void a(StringBuilder $$0) {
         $$0.append("LegacyPositionalRandomFactory{").append(this.a).append("}");
      }
   }
}
