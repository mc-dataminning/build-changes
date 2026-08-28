import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class eik extends egw<ejy> {
   public eik(Codec<ejy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egy<ejy> $$0) {
      dig $$1 = $$0.b();
      jh $$2 = $$0.e();
      ejy $$3 = $$0.f();
      bam $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jh $$6 = $$2.h($$5.getAsInt());
         kl $$7 = new kl($$3.c, $$3.c, $$3.c);
         eoc $$8 = eoc.a($$6.b($$7), $$6.a($$7));
         return jh.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dko.le.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dig $$0, jh $$1, ejy $$2) {
      Predicate<dxv> $$3 = $$0x -> $$0x.a(dko.J);
      Predicate<dxv> $$4 = $$0x -> !$$0x.a(dko.J);
      Optional<edg> $$5 = edg.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(edg::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dig $$0, jh $$1) {
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

   private boolean a(dhj $$0, jh $$1) {
      dxv $$2 = $$0.a_($$1);
      return $$2.a(dko.J) || $$2.l();
   }
}
