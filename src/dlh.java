import java.util.function.LongFunction;

public class dlh extends dkj {
   private final aru d;
   private int e;

   public dlh(aru $$0) {
      super(0L);
      this.d = $$0;
   }

   public int l() {
      return this.e;
   }

   @Override
   public aru d() {
      return this.d.d();
   }

   @Override
   public dkv e() {
      return this.d.e();
   }

   @Override
   public int c(int $$0) {
      this.e++;
      return this.d instanceof dkj $$1 ? $$1.c($$0) : (int)(this.d.g() >>> 64 - $$0);
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

   public static aru a(int $$0, int $$1, long $$2, long $$3) {
      return aru.a($$2 + (long)($$0 * $$0 * 4987142) + (long)($$0 * 5947611) + (long)($$1 * $$1) * 4392871L + (long)($$1 * 389711) ^ $$3);
   }

   public static enum a {
      a(dkj::new),
      b(dlj::new);

      private final LongFunction<aru> c;

      private a(LongFunction<aru> $$0) {
         this.c = $$0;
      }

      public aru a(long $$0) {
         return this.c.apply($$0);
      }
   }
}
