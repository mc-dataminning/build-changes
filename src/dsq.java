import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dsq extends drc<due> {
   public dsq(Codec<due> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<due> $$0) {
      ctt $$1 = $$0.b();
      hv $$2 = $$0.e();
      due $$3 = $$0.f();
      auf $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         hv $$6 = $$2.h($$5.getAsInt());
         iz $$7 = new iz($$3.c, $$3.c, $$3.c);
         dyg $$8 = dyg.a($$6.b($$7), $$6.a($$7));
         return hv.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, cwb.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(ctt $$0, hv $$1, due $$2) {
      Predicate<dip> $$3 = $$0x -> $$0x.a(cwb.G);
      Predicate<dip> $$4 = $$0x -> !$$0x.a(cwb.G);
      Optional<dno> $$5 = dno.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dno::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(ctt $$0, hv $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ia $$2 : ia.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(csz $$0, hv $$1) {
      dip $$2 = $$0.a_($$1);
      return $$2.a(cwb.G) || $$2.i();
   }
}
