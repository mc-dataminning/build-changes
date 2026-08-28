import com.mojang.serialization.Codec;

public class edo extends ecd<efc> {
   public edo(Codec<efc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecf<efc> $$0) {
      efc $$1 = $$0.f();
      dds $$2 = $$0.b();
      jd $$3 = $$0.e();
      if (!$$2.a_($$3.d()).a($$1.f)) {
         return false;
      } else if ($$1.c && !$$2.a_($$3.e()).a($$1.f)) {
         return false;
      } else {
         dtc $$4 = $$2.a_($$3);
         if (!$$4.i() && !$$4.a($$1.f)) {
            return false;
         } else {
            int $$5 = 0;
            int $$6 = 0;
            if ($$2.a_($$3.h()).a($$1.f)) {
               $$6++;
            }

            if ($$2.a_($$3.i()).a($$1.f)) {
               $$6++;
            }

            if ($$2.a_($$3.f()).a($$1.f)) {
               $$6++;
            }

            if ($$2.a_($$3.g()).a($$1.f)) {
               $$6++;
            }

            if ($$2.a_($$3.e()).a($$1.f)) {
               $$6++;
            }

            int $$7 = 0;
            if ($$2.u($$3.h())) {
               $$7++;
            }

            if ($$2.u($$3.i())) {
               $$7++;
            }

            if ($$2.u($$3.f())) {
               $$7++;
            }

            if ($$2.u($$3.g())) {
               $$7++;
            }

            if ($$2.u($$3.e())) {
               $$7++;
            }

            if ($$6 == $$1.d && $$7 == $$1.e) {
               $$2.a($$3, $$1.b.g(), 2);
               $$2.a($$3, $$1.b.a(), 0);
               $$5++;
            }

            return $$5 > 0;
         }
      }
   }
}
