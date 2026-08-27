import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dmc extends dko<dnq> {
   public dmc(Codec<dnq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dnq> $$0) {
      cng $$1 = $$0.b();
      gu $$2 = $$0.e();
      dnq $$3 = $$0.f();
      apf $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if (!$$5.isPresent()) {
         return false;
      } else {
         gu $$6 = $$2.h($$5.getAsInt());
         hz $$7 = new hz($$3.c, $$3.c, $$3.c);
         eed $$8 = new eed($$6.b($$7), $$6.a($$7));
         return gu.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, cpo.kJ.n(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cng $$0, gu $$1, dnq $$2) {
      Predicate<dcb> $$3 = $$0x -> $$0x.a(cpo.G);
      Predicate<dcb> $$4 = $$0x -> !$$0x.a(cpo.G);
      Optional<dha> $$5 = dha.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dha::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cng $$0, gu $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ha $$2 : ha.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(cmn $$0, gu $$1) {
      dcb $$2 = $$0.a_($$1);
      return $$2.a(cpo.G) || $$2.i();
   }
}
