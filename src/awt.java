import io.netty.util.internal.ThreadLocalRandom;

public interface awt {
   @Deprecated
   double a = 2.297;

   static awt a() {
      return a(dsf.a());
   }

   @Deprecated
   static awt b() {
      return new dsj(dsf.a());
   }

   static awt a(long $$0) {
      return new drr($$0);
   }

   static awt c() {
      return new dsg(ThreadLocalRandom.current().nextLong());
   }

   awt d();

   dsd e();

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
