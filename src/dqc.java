import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dqc extends doo<drq> {
   public dqc(Codec<drq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<drq> $$0) {
      crt $$1 = $$0.b();
      ht $$2 = $$0.e();
      drq $$3 = $$0.f();
      ate $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ht $$6 = $$2.h($$5.getAsInt());
         iw $$7 = new iw($$3.c, $$3.c, $$3.c);
         eia $$8 = new eia($$6.b($$7), $$6.a($$7));
         return ht.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, cuc.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(crt $$0, ht $$1, drq $$2) {
      Predicate<dgb> $$3 = $$0x -> $$0x.a(cuc.G);
      Predicate<dgb> $$4 = $$0x -> !$$0x.a(cuc.G);
      Optional<dla> $$5 = dla.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dla::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(crt $$0, ht $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (hx $$2 : hx.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(cra $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1);
      return $$2.a(cuc.G) || $$2.i();
   }
}
