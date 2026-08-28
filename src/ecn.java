import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ecn extends eaz<eeb> {
   public ecn(Codec<eeb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebb<eeb> $$0) {
      dcu $$1 = $$0.b();
      iz $$2 = $$0.e();
      eeb $$3 = $$0.f();
      azh $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iz $$6 = $$2.h($$5.getAsInt());
         kd $$7 = new kd($$3.c, $$3.c, $$3.c);
         eid $$8 = eid.a($$6.b($$7), $$6.a($$7));
         return iz.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dfc.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dcu $$0, iz $$1, eeb $$2) {
      Predicate<dsd> $$3 = $$0x -> $$0x.a(dfc.G);
      Predicate<dsd> $$4 = $$0x -> !$$0x.a(dfc.G);
      Optional<dxl> $$5 = dxl.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dxl::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dcu $$0, iz $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (je $$2 : je.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dca $$0, iz $$1) {
      dsd $$2 = $$0.a_($$1);
      return $$2.a(dfc.G) || $$2.i();
   }
}
