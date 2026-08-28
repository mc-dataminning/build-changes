import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ehn extends efz<ejb> {
   public ehn(Codec<ejb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egb<ejb> $$0) {
      dhh $$1 = $$0.b();
      ji $$2 = $$0.e();
      ejb $$3 = $$0.f();
      azh $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ji $$6 = $$2.h($$5.getAsInt());
         km $$7 = new km($$3.c, $$3.c, $$3.c);
         enf $$8 = enf.a($$6.b($$7), $$6.a($$7));
         return ji.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, djp.ll.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dhh $$0, ji $$1, ejb $$2) {
      Predicate<dwy> $$3 = $$0x -> $$0x.a(djp.J);
      Predicate<dwy> $$4 = $$0x -> !$$0x.a(djp.J);
      Optional<ecj> $$5 = ecj.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(ecj::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dhh $$0, ji $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (jn $$2 : jn.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dgk $$0, ji $$1) {
      dwy $$2 = $$0.a_($$1);
      return $$2.a(djp.J) || $$2.l();
   }
}
