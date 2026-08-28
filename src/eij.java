import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class eij extends egv<ejx> {
   public eij(Codec<ejx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egx<ejx> $$0) {
      dif $$1 = $$0.b();
      jh $$2 = $$0.e();
      ejx $$3 = $$0.f();
      bam $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jh $$6 = $$2.h($$5.getAsInt());
         kl $$7 = new kl($$3.c, $$3.c, $$3.c);
         eob $$8 = eob.a($$6.b($$7), $$6.a($$7));
         return jh.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dkn.le.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dif $$0, jh $$1, ejx $$2) {
      Predicate<dxu> $$3 = $$0x -> $$0x.a(dkn.J);
      Predicate<dxu> $$4 = $$0x -> !$$0x.a(dkn.J);
      Optional<edf> $$5 = edf.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(edf::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dif $$0, jh $$1) {
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

   private boolean a(dhi $$0, jh $$1) {
      dxu $$2 = $$0.a_($$1);
      return $$2.a(dkn.J) || $$2.l();
   }
}
