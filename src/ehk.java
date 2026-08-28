import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ehk extends efw<eiy> {
   public ehk(Codec<eiy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eiy> $$0) {
      dhe $$1 = $$0.b();
      ji $$2 = $$0.e();
      eiy $$3 = $$0.f();
      azg $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ji $$6 = $$2.h($$5.getAsInt());
         km $$7 = new km($$3.c, $$3.c, $$3.c);
         enc $$8 = enc.a($$6.b($$7), $$6.a($$7));
         return ji.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, djm.ll.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dhe $$0, ji $$1, eiy $$2) {
      Predicate<dwv> $$3 = $$0x -> $$0x.a(djm.J);
      Predicate<dwv> $$4 = $$0x -> !$$0x.a(djm.J);
      Optional<ecg> $$5 = ecg.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(ecg::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dhe $$0, ji $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (jn $$2 : jn.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dgh $$0, ji $$1) {
      dwv $$2 = $$0.a_($$1);
      return $$2.a(djm.J) || $$2.l();
   }
}
