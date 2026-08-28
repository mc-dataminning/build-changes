import com.google.common.annotations.VisibleForTesting;
import java.util.concurrent.atomic.AtomicLong;

public class dyg implements dxu {
   private static final int d = 48;
   private static final long e = 281474976710655L;
   private static final long f = 25214903917L;
   private static final long g = 11L;
   private final AtomicLong h = new AtomicLong();
   private final dyh i = new dyh(this);

   public dyg(long $$0) {
      this.b($$0);
   }

   @Override
   public ayo d() {
      return new dyg(this.g());
   }

   @Override
   public dys e() {
      return new dyg.a(this.g());
   }

   @Override
   public void b(long $$0) {
      if (!this.h.compareAndSet(this.h.get(), ($$0 ^ 25214903917L) & 281474976710655L)) {
         throw azf.a("LegacyRandomSource", null);
      } else {
         this.i.a();
      }
   }

   @Override
   public int c(int $$0) {
      long $$1 = this.h.get();
      long $$2 = $$1 * 25214903917L + 11L & 281474976710655L;
      if (!this.h.compareAndSet($$1, $$2)) {
         throw azf.a("LegacyRandomSource", null);
      } else {
         return (int)($$2 >> 48 - $$0);
      }
   }

   @Override
   public double k() {
      return this.i.b();
   }

   public static class a implements dys {
      private final long a;

      public a(long $$0) {
         this.a = $$0;
      }

      @Override
      public ayo a(int $$0, int $$1, int $$2) {
         long $$3 = ayg.b($$0, $$1, $$2);
         long $$4 = $$3 ^ this.a;
         return new dyg($$4);
      }

      @Override
      public ayo a(String $$0) {
         int $$1 = $$0.hashCode();
         return new dyg((long)$$1 ^ this.a);
      }

      @VisibleForTesting
      @Override
      public void a(StringBuilder $$0) {
         $$0.append("LegacyPositionalRandomFactory{").append(this.a).append("}");
      }
   }
}
