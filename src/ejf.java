import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ejf extends ehr<ekt> {
   public ejf(Codec<ekt> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekt> $$0) {
      dio $$1 = $$0.b();
      jj $$2 = $$0.e();
      ekt $$3 = $$0.f();
      azs $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jj $$6 = $$2.h($$5.getAsInt());
         kn $$7 = new kn($$3.c, $$3.c, $$3.c);
         eoy $$8 = eoy.a($$6.b($$7), $$6.a($$7));
         return jj.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dkw.ll.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dio $$0, jj $$1, ekt $$2) {
      Predicate<dym> $$3 = $$0x -> $$0x.a(dkw.J);
      Predicate<dym> $$4 = $$0x -> !$$0x.a(dkw.J);
      Optional<eeb> $$5 = eeb.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(eeb::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dio $$0, jj $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (jo $$2 : jo.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dhq $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      return $$2.a(dkw.J) || $$2.l();
   }
}
