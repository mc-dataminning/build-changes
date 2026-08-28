import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class enp extends elg {
   public static final MapCodec<enp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ejn.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, enp::new)
   );
   public final ejn e;

   public enp(elg.c $$0, ejn $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      ebn $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      ebl $$5 = new ebl($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dev $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      jf.a $$8 = new jf.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dus $$9 = $$7.a($$6);
         dus $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dho.dW) || $$10.c(ddy.a, $$8.q($$6), jk.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         jf $$11 = new jf($$2, $$6, $$3);
         return Optional.of(new elg.b($$11, (Consumer<ely>)($$3x -> eno.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public elp<?> e() {
      return elp.i;
   }
}
