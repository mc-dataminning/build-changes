import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ech extends eat<edv> {
   public ech(Codec<edv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<edv> $$0) {
      dco $$1 = $$0.b();
      iz $$2 = $$0.e();
      edv $$3 = $$0.f();
      azc $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iz $$6 = $$2.h($$5.getAsInt());
         kd $$7 = new kd($$3.c, $$3.c, $$3.c);
         ehx $$8 = ehx.a($$6.b($$7), $$6.a($$7));
         return iz.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dew.kJ.n(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dco $$0, iz $$1, edv $$2) {
      Predicate<drx> $$3 = $$0x -> $$0x.a(dew.G);
      Predicate<drx> $$4 = $$0x -> !$$0x.a(dew.G);
      Optional<dxf> $$5 = dxf.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dxf::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dco $$0, iz $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (je $$2 : je.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dbu $$0, iz $$1) {
      drx $$2 = $$0.a_($$1);
      return $$2.a(dew.G) || $$2.i();
   }
}
