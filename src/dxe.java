import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class dxe extends dvd {
   public static final Codec<dxe> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dtk.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, dxe::new)
   );
   public final dtk e;

   public dxe(dvd.c $$0, dtk $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dvd.b> a(dvd.a $$0) {
      dlm $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dlk $$5 = new dlk($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cqc $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      gw.a $$8 = new gw.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dfe $$9 = $$7.a($$6);
         dfe $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(csr.dX) || $$10.d(cpf.a, $$8.q($$6), hc.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         gw $$11 = new gw($$2, $$6, $$3);
         return Optional.of(new dvd.b($$11, (Consumer<dvv>)($$3x -> dxd.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dvm<?> e() {
      return dvm.i;
   }
}
