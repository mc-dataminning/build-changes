import com.mojang.serialization.Codec;

public class dow extends dnl<dqk> {
   public dow(Codec<dqk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dqk> $$0) {
      dqk $$1 = $$0.f();
      cqe $$2 = $$0.b();
      gv $$3 = $$0.e();
      if (!$$2.a_($$3.c()).a($$1.f)) {
         return false;
      } else if ($$1.c && !$$2.a_($$3.d()).a($$1.f)) {
         return false;
      } else {
         dey $$4 = $$2.a_($$3);
         if (!$$4.i() && !$$4.a($$1.f)) {
            return false;
         } else {
            int $$5 = 0;
            int $$6 = 0;
            if ($$2.a_($$3.g()).a($$1.f)) {
               $$6++;
            }

            if ($$2.a_($$3.h()).a($$1.f)) {
               $$6++;
            }

            if ($$2.a_($$3.e()).a($$1.f)) {
               $$6++;
            }

            if ($$2.a_($$3.f()).a($$1.f)) {
               $$6++;
            }

            if ($$2.a_($$3.d()).a($$1.f)) {
               $$6++;
            }

            int $$7 = 0;
            if ($$2.t($$3.g())) {
               $$7++;
            }

            if ($$2.t($$3.h())) {
               $$7++;
            }

            if ($$2.t($$3.e())) {
               $$7++;
            }

            if ($$2.t($$3.f())) {
               $$7++;
            }

            if ($$2.t($$3.d())) {
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
