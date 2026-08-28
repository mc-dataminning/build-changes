import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class edo extends eca<efc> {
   public edo(Codec<efc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<efc> $$0) {
      ddq $$1 = $$0.b();
      jd $$2 = $$0.e();
      efc $$3 = $$0.f();
      ayv $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jd $$6 = $$2.h($$5.getAsInt());
         kh $$7 = new kh($$3.c, $$3.c, $$3.c);
         eje $$8 = eje.a($$6.b($$7), $$6.a($$7));
         return jd.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dfy.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(ddq $$0, jd $$1, efc $$2) {
      Predicate<dta> $$3 = $$0x -> $$0x.a(dfy.G);
      Predicate<dta> $$4 = $$0x -> !$$0x.a(dfy.G);
      Optional<dyl> $$5 = dyl.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dyl::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(ddq $$0, jd $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ji $$2 : ji.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dcv $$0, jd $$1) {
      dta $$2 = $$0.a_($$1);
      return $$2.a(dfy.G) || $$2.i();
   }
}
