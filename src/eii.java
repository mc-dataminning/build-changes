import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class eii extends egu<ejw> {
   public eii(Codec<ejw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egw<ejw> $$0) {
      dhy $$1 = $$0.b();
      ji $$2 = $$0.e();
      ejw $$3 = $$0.f();
      azh $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ji $$6 = $$2.h($$5.getAsInt());
         km $$7 = new km($$3.c, $$3.c, $$3.c);
         eob $$8 = eob.a($$6.b($$7), $$6.a($$7));
         return ji.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dkg.ll.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dhy $$0, ji $$1, ejw $$2) {
      Predicate<dxq> $$3 = $$0x -> $$0x.a(dkg.J);
      Predicate<dxq> $$4 = $$0x -> !$$0x.a(dkg.J);
      Optional<ede> $$5 = ede.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(ede::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dhy $$0, ji $$1) {
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

   private boolean a(dha $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      return $$2.a(dkg.J) || $$2.l();
   }
}
