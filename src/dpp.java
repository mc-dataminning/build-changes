import java.util.function.LongFunction;

public class dpp extends dor {
   private final auv d;
   private int e;

   public dpp(auv $$0) {
      super(0L);
      this.d = $$0;
   }

   public int l() {
      return this.e;
   }

   @Override
   public auv d() {
      return this.d.d();
   }

   @Override
   public dpd e() {
      return this.d.e();
   }

   @Override
   public int c(int $$0) {
      this.e++;
      return this.d instanceof dor $$1 ? $$1.c($$0) : (int)(this.d.g() >>> 64 - $$0);
   }

   @Override
   public synchronized void b(long $$0) {
      if (this.d != null) {
         this.d.b($$0);
      }
   }

   public long a(long $$0, int $$1, int $$2) {
      this.b($$0);
      long $$3 = this.g() | 1L;
      long $$4 = this.g() | 1L;
      long $$5 = (long)$$1 * $$3 + (long)$$2 * $$4 ^ $$0;
      this.b($$5);
      return $$5;
   }

   public void b(long $$0, int $$1, int $$2) {
      long $$3 = $$0 + (long)$$1 + (long)(10000 * $$2);
      this.b($$3);
   }

   public void c(long $$0, int $$1, int $$2) {
      this.b($$0);
      long $$3 = this.g();
      long $$4 = this.g();
      long $$5 = (long)$$1 * $$3 ^ (long)$$2 * $$4 ^ $$0;
      this.b($$5);
   }

   public void a(long $$0, int $$1, int $$2, int $$3) {
      long $$4 = (long)$$1 * 341873128712L + (long)$$2 * 132897987541L + $$0 + (long)$$3;
      this.b($$4);
   }

   public static auv a(int $$0, int $$1, long $$2, long $$3) {
      return auv.a($$2 + (long)($$0 * $$0 * 4987142) + (long)($$0 * 5947611) + (long)($$1 * $$1) * 4392871L + (long)($$1 * 389711) ^ $$3);
   }

   public static enum a {
      a(dor::new),
      b(dpr::new);

      private final LongFunction<auv> c;

      private a(LongFunction<auv> $$0) {
         this.c = $$0;
      }

      public auv a(long $$0) {
         return this.c.apply($$0);
      }
   }
}
