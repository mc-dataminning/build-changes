import io.netty.util.internal.ThreadLocalRandom;

public interface aym {
   @Deprecated
   double a = 2.297;

   static aym a() {
      return a(dyo.a());
   }

   @Deprecated
   static aym b() {
      return new dys(dyo.a());
   }

   static aym a(long $$0) {
      return new dya($$0);
   }

   static aym c() {
      return new dyp(ThreadLocalRandom.current().nextLong());
   }

   aym d();

   dym e();

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
