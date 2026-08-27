import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class efm extends ede {
   public static final Codec<efm> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), ebl.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, efm::new)
   );
   public final ebl e;

   public efm(ede.c $$0, ebl $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ede.b> a(ede.a $$0) {
      dtn $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dtl $$5 = new dtl($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cxn $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ib.a $$8 = new ib.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dnb $$9 = $$7.a($$6);
         dnb $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dae.dW) || $$10.d(cwq.a, $$8.q($$6), ih.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ib $$11 = new ib($$2, $$6, $$3);
         return Optional.of(new ede.b($$11, (Consumer<edw>)($$3x -> efl.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public edn<?> e() {
      return edn.i;
   }
}
