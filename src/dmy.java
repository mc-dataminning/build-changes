import java.util.concurrent.atomic.AtomicLong;

@Deprecated
public class dmy implements dlu {
   private static final int d = 48;
   private static final long e = 281474976710655L;
   private static final long f = 25214903917L;
   private static final long g = 11L;
   private final AtomicLong h = new AtomicLong();
   private final dmh i = new dmh(this);

   public dmy(long $$0) {
      this.b($$0);
   }

   @Override
   public ato d() {
      return new dmy(this.g());
   }

   @Override
   public dms e() {
      return new dmg.a(this.g());
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
