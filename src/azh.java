import io.netty.util.internal.ThreadLocalRandom;

public interface azh {
   @Deprecated
   double a = 2.297;

   static azh a() {
      return a(edi.a());
   }

   @Deprecated
   static azh b() {
      return new edm(edi.a());
   }

   static azh a(long $$0) {
      return new ecu($$0);
   }

   static azh c() {
      return new edj(ThreadLocalRandom.current().nextLong());
   }

   azh d();

   edg e();

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
