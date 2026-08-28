import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class emx extends eko {
   public static final MapCodec<emx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eiv.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, emx::new)
   );
   public final eiv e;

   public emx(eko.c $$0, eiv $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eko.b> a(eko.a $$0) {
      eav $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      eat $$5 = new eat($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dee $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      je.a $$8 = new je.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dua $$9 = $$7.a($$6);
         dua $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dgx.dW) || $$10.c(ddh.a, $$8.q($$6), jj.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         je $$11 = new je($$2, $$6, $$3);
         return Optional.of(new eko.b($$11, (Consumer<elg>)($$3x -> emw.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public ekx<?> e() {
      return ekx.i;
   }
}
