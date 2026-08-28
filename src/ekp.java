import com.mojang.serialization.Codec;

public class ekp extends eje<emd> {
   public ekp(Codec<emd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<emd> $$0) {
      emd $$1 = $$0.f();
      dju $$2 = $$0.b();
      iu $$3 = $$0.e();
      if (!$$2.a_($$3.d()).a($$1.f)) {
         return false;
      } else if ($$1.c && !$$2.a_($$3.e()).a($$1.f)) {
         return false;
      } else {
         dzz $$4 = $$2.a_($$3);
         if (!$$4.l() && !$$4.a($$1.f)) {
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
            if ($$2.v($$3.h())) {
               $$7++;
            }

            if ($$2.v($$3.i())) {
               $$7++;
            }

            if ($$2.v($$3.f())) {
               $$7++;
            }

            if ($$2.v($$3.g())) {
               $$7++;
            }

            if ($$2.v($$3.e())) {
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
