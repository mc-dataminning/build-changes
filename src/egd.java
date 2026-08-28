import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class egd extends eep<ehr> {
   public egd(Codec<ehr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eer<ehr> $$0) {
      dgd $$1 = $$0.b();
      jh $$2 = $$0.e();
      ehr $$3 = $$0.f();
      azv $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jh $$6 = $$2.h($$5.getAsInt());
         kl $$7 = new kl($$3.c, $$3.c, $$3.c);
         elt $$8 = elt.a($$6.b($$7), $$6.a($$7));
         return jh.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dil.kJ.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dgd $$0, jh $$1, ehr $$2) {
      Predicate<dvo> $$3 = $$0x -> $$0x.a(dil.G);
      Predicate<dvo> $$4 = $$0x -> !$$0x.a(dil.G);
      Optional<eaz> $$5 = eaz.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(eaz::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dgd $$0, jh $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (jm $$2 : jm.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dfg $$0, jh $$1) {
      dvo $$2 = $$0.a_($$1);
      return $$2.a(dil.G) || $$2.l();
   }
}
