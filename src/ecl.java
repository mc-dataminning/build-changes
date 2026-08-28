import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ecl extends eax<edz> {
   public ecl(Codec<edz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edz> $$0) {
      dcs $$1 = $$0.b();
      iz $$2 = $$0.e();
      edz $$3 = $$0.f();
      azg $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iz $$6 = $$2.h($$5.getAsInt());
         kd $$7 = new kd($$3.c, $$3.c, $$3.c);
         eib $$8 = eib.a($$6.b($$7), $$6.a($$7));
         return iz.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dfa.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dcs $$0, iz $$1, edz $$2) {
      Predicate<dsb> $$3 = $$0x -> $$0x.a(dfa.G);
      Predicate<dsb> $$4 = $$0x -> !$$0x.a(dfa.G);
      Optional<dxj> $$5 = dxj.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dxj::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dcs $$0, iz $$1) {
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

   private boolean a(dby $$0, iz $$1) {
      dsb $$2 = $$0.a_($$1);
      return $$2.a(dfa.G) || $$2.i();
   }
}
