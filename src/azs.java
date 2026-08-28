import io.netty.util.internal.ThreadLocalRandom;

public interface azs {
   @Deprecated
   double a = 2.297;

   static azs a() {
      return a(efa.a());
   }

   @Deprecated
   static azs b() {
      return new efe(efa.a());
   }

   static azs a(long $$0) {
      return new eem($$0);
   }

   static azs c() {
      return new efb(ThreadLocalRandom.current().nextLong());
   }

   azs d();

   eey e();

   void b(long var1);

   int f();

   int a(int var1);

   default int a(int $$0, int $$1) {
      return this.a($$1 - $$0 + 1) + $$0;
   }

   long g();

   boolean h();

   float i();

   double j();

   double k();

   default double a(double $$0, double $$1) {
      return $$0 + $$1 * (this.j() - this.j());
   }

   default float a(float $$0, float $$1) {
      return $$0 + $$1 * (this.i() - this.i());
   }

   default void b(int $$0) {
      for (int $$1 = 0; $$1 < $$0; $$1++) {
         this.f();
      }
   }

   default int b(int $$0, int $$1) {
      if ($$0 >= $$1) {
         throw new IllegalArgumentException("bound - origin is non positive");
      } else {
         return $$0 + this.a($$1 - $$0);
      }
   }
}
