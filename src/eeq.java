import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class eeq extends edc<ege> {
   public eeq(Codec<ege> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<ege> $$0) {
      dep $$1 = $$0.b();
      je $$2 = $$0.e();
      ege $$3 = $$0.f();
      azk $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         je $$6 = $$2.h($$5.getAsInt());
         ki $$7 = new ki($$3.c, $$3.c, $$3.c);
         ekg $$8 = ekg.a($$6.b($$7), $$6.a($$7));
         return je.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dgx.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dep $$0, je $$1, ege $$2) {
      Predicate<dua> $$3 = $$0x -> $$0x.a(dgx.G);
      Predicate<dua> $$4 = $$0x -> !$$0x.a(dgx.G);
      Optional<dzm> $$5 = dzm.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dzm::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dep $$0, je $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (jj $$2 : jj.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(ddt $$0, je $$1) {
      dua $$2 = $$0.a_($$1);
      return $$2.a(dgx.G) || $$2.l();
   }
}
