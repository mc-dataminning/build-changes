import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dvg extends dts<dwu> {
   public dvg(Codec<dwu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwu> $$0) {
      cwi $$1 = $$0.b();
      hz $$2 = $$0.e();
      dwu $$3 = $$0.f();
      awo $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         hz $$6 = $$2.h($$5.getAsInt());
         jd $$7 = new jd($$3.c, $$3.c, $$3.c);
         eaw $$8 = eaw.a($$6.b($$7), $$6.a($$7));
         return hz.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, cyq.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cwi $$0, hz $$1, dwu $$2) {
      Predicate<dlf> $$3 = $$0x -> $$0x.a(cyq.G);
      Predicate<dlf> $$4 = $$0x -> !$$0x.a(cyq.G);
      Optional<dqe> $$5 = dqe.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dqe::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cwi $$0, hz $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ie $$2 : ie.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(cvo $$0, hz $$1) {
      dlf $$2 = $$0.a_($$1);
      return $$2.a(cyq.G) || $$2.i();
   }
}
