public class fii {
   private volatile long a;
   private volatile long b;
   private long c = af.c();
   private long d;
   private long e;

   public void a(long $$0) {
      this.b = $$0;
   }

   public long a() {
      return this.b;
   }

   public long b() {
      return this.a;
   }

   public void b(long $$0) {
      this.a += $$0;
   }

   public boolean c() {
      return this.a != 0L;
   }

   public boolean d() {
      return this.a == this.a();
   }

   public double e() {
      return Math.min((double)this.b() / (double)this.a(), 1.0);
   }

   public void f() {
      long $$0 = af.c();
      long $$1 = $$0 - this.c;
      if ($$1 >= 1000L) {
         long $$2 = this.a;
         this.e = 1000L * ($$2 - this.d) / $$1;
         this.d = $$2;
         this.c = $$0;
      }
   }

   public long g() {
      return this.e;
   }
}
