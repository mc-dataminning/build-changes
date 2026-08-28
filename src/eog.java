import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eog extends elx {
   public static final MapCodec<eog> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eke.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eog::new)
   );
   public final eke e;

   public eog(elx.c $$0, eke $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      ece $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      ecc $$5 = new ecc($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dfn $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      jh.a $$8 = new jh.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dvj $$9 = $$7.a($$6);
         dvj $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dig.dW) || $$10.c(deq.a, $$8.q($$6), jm.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         jh $$11 = new jh($$2, $$6, $$3);
         return Optional.of(new elx.b($$11, (Consumer<emp>)($$3x -> eof.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public emg<?> e() {
      return emg.i;
   }
}
