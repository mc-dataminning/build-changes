import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dro extends dqa<dtc> {
   public dro(Codec<dtc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dtc> $$0) {
      csz $$1 = $$0.b();
      hx $$2 = $$0.e();
      dtc $$3 = $$0.f();
      atw $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         hx $$6 = $$2.h($$5.getAsInt());
         ja $$7 = new ja($$3.c, $$3.c, $$3.c);
         dxe $$8 = dxe.a($$6.b($$7), $$6.a($$7));
         return hx.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, cvh.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(csz $$0, hx $$1, dtc $$2) {
      Predicate<dhn> $$3 = $$0x -> $$0x.a(cvh.G);
      Predicate<dhn> $$4 = $$0x -> !$$0x.a(cvh.G);
      Optional<dmm> $$5 = dmm.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dmm::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(csz $$0, hx $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ib $$2 : ib.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(csg $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1);
      return $$2.a(cvh.G) || $$2.i();
   }
}
