import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eoa extends elr {
   public static final MapCodec<eoa> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ejy.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eoa::new)
   );
   public final ejy e;

   public eoa(elr.c $$0, ejy $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<elr.b> a(elr.a $$0) {
      eby $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      ebw $$5 = new ebw($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dfh $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      jg.a $$8 = new jg.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dvd $$9 = $$7.a($$6);
         dvd $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dia.dW) || $$10.c(dek.a, $$8.q($$6), jl.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         jg $$11 = new jg($$2, $$6, $$3);
         return Optional.of(new elr.b($$11, (Consumer<emj>)($$3x -> enz.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public ema<?> e() {
      return ema.i;
   }
}
