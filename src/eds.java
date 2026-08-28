import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class eds extends ece<efg> {
   public eds(Codec<efg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecg<efg> $$0) {
      dds $$1 = $$0.b();
      jd $$2 = $$0.e();
      efg $$3 = $$0.f();
      ayw $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jd $$6 = $$2.h($$5.getAsInt());
         kh $$7 = new kh($$3.c, $$3.c, $$3.c);
         ejj $$8 = ejj.a($$6.b($$7), $$6.a($$7));
         return jd.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dga.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dds $$0, jd $$1, efg $$2) {
      Predicate<dtc> $$3 = $$0x -> $$0x.a(dga.G);
      Predicate<dtc> $$4 = $$0x -> !$$0x.a(dga.G);
      Optional<dyo> $$5 = dyo.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dyo::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dds $$0, jd $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
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

   private boolean a(dcx $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1);
      return $$2.a(dga.G) || $$2.i();
   }
}
