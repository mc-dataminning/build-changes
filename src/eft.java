import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class eft extends eef<ehh> {
   public eft(Codec<ehh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<ehh> $$0) {
      dfs $$1 = $$0.b();
      jg $$2 = $$0.e();
      ehh $$3 = $$0.f();
      azr $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jg $$6 = $$2.h($$5.getAsInt());
         kk $$7 = new kk($$3.c, $$3.c, $$3.c);
         elj $$8 = elj.a($$6.b($$7), $$6.a($$7));
         return jg.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dia.kJ.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dfs $$0, jg $$1, ehh $$2) {
      Predicate<dvd> $$3 = $$0x -> $$0x.a(dia.G);
      Predicate<dvd> $$4 = $$0x -> !$$0x.a(dia.G);
      Optional<eap> $$5 = eap.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(eap::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dfs $$0, jg $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (jl $$2 : jl.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dew $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      return $$2.a(dia.G) || $$2.l();
   }
}
