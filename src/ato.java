import io.netty.util.internal.ThreadLocalRandom;

public interface ato {
   @Deprecated
   double a = 2.297;

   static ato a() {
      return a(dmu.a());
   }

   @Deprecated
   static ato b() {
      return new dmy(dmu.a());
   }

   static ato a(long $$0) {
      return new dmg($$0);
   }

   static ato c() {
      return new dmv(ThreadLocalRandom.current().nextLong());
   }

   ato d();

   dms e();

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
