import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dxg extends dvs<dyu> {
   public dxg(Codec<dyu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvu<dyu> $$0) {
      cxw $$1 = $$0.b();
      ib $$2 = $$0.e();
      dyu $$3 = $$0.f();
      axd $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ib $$6 = $$2.h($$5.getAsInt());
         jg $$7 = new jg($$3.c, $$3.c, $$3.c);
         ecw $$8 = ecw.a($$6.b($$7), $$6.a($$7));
         return ib.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dae.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cxw $$0, ib $$1, dyu $$2) {
      Predicate<dnb> $$3 = $$0x -> $$0x.a(dae.G);
      Predicate<dnb> $$4 = $$0x -> !$$0x.a(dae.G);
      Optional<dse> $$5 = dse.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dse::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cxw $$0, ib $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ih $$2 : ih.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(cxc $$0, ib $$1) {
      dnb $$2 = $$0.a_($$1);
      return $$2.a(dae.G) || $$2.i();
   }
}
