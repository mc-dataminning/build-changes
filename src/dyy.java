import java.util.concurrent.atomic.AtomicLong;

@Deprecated
public class dyy implements dxu {
   private static final int d = 48;
   private static final long e = 281474976710655L;
   private static final long f = 25214903917L;
   private static final long g = 11L;
   private final AtomicLong h = new AtomicLong();
   private final dyh i = new dyh(this);

   public dyy(long $$0) {
      this.b($$0);
   }

   @Override
   public ayo d() {
      return new dyy(this.g());
   }

   @Override
   public dys e() {
      return new dyg.a(this.g());
   }

   @Override
   public void b(long $$0) {
      this.h.set(($$0 ^ 25214903917L) & 281474976710655L);
   }

   @Override
   public int c(int $$0) {
      long $$1;
      long $$2;
      do {
         $$1 = this.h.get();
         $$2 = $$1 * 25214903917L + 11L & 281474976710655L;
      } while (!this.h.compareAndSet($$1, $$2));

      return (int)($$2 >>> 48 - $$0);
   }

   @Override
   public double k() {
      return this.i.b();
   }
}
