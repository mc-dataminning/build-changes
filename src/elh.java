import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class elh extends ejt<emv> {
   public elh(Codec<emv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejv<emv> $$0) {
      dkg $$1 = $$0.b();
      iv $$2 = $$0.e();
      emv $$3 = $$0.f();
      azv $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iv $$6 = $$2.h($$5.getAsInt());
         ka $$7 = new ka($$3.c, $$3.c, $$3.c);
         era $$8 = era.a($$6.b($$7), $$6.a($$7));
         return iv.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dmo.lp.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dkg $$0, iv $$1, emv $$2) {
      Predicate<eao> $$3 = $$0x -> $$0x.a(dmo.J);
      Predicate<eao> $$4 = $$0x -> !$$0x.a(dmo.J);
      Optional<egd> $$5 = egd.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(egd::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dkg $$0, iv $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (jb $$2 : jb.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dji $$0, iv $$1) {
      eao $$2 = $$0.a_($$1);
      return $$2.a(dmo.J) || $$2.l();
   }
}
