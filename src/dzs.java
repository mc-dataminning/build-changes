import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dzs extends dye<ebg> {
   public dzs(Codec<ebg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<ebg> $$0) {
      dab $$1 = $$0.b();
      id $$2 = $$0.e();
      ebg $$3 = $$0.f();
      axt $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         id $$6 = $$2.h($$5.getAsInt());
         ji $$7 = new ji($$3.c, $$3.c, $$3.c);
         efi $$8 = efi.a($$6.b($$7), $$6.a($$7));
         return id.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dcj.kJ.n(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dab $$0, id $$1, ebg $$2) {
      Predicate<dpi> $$3 = $$0x -> $$0x.a(dcj.G);
      Predicate<dpi> $$4 = $$0x -> !$$0x.a(dcj.G);
      Optional<duq> $$5 = duq.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(duq::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dab $$0, id $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ij $$2 : ij.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(czh $$0, id $$1) {
      dpi $$2 = $$0.a_($$1);
      return $$2.a(dcj.G) || $$2.i();
   }
}
