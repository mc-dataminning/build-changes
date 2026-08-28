import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eok extends emb {
   public static final MapCodec<eok> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eki.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eok::new)
   );
   public final eki e;

   public eok(emb.c $$0, eki $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<emb.b> a(emb.a $$0) {
      eci $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      ecg $$5 = new ecg($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dfr $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      jh.a $$8 = new jh.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dvo $$9 = $$7.a($$6);
         dvo $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dil.dW) || $$10.c(deu.a, $$8.q($$6), jm.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         jh $$11 = new jh($$2, $$6, $$3);
         return Optional.of(new emb.b($$11, (Consumer<emt>)($$3x -> eoj.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public emk<?> e() {
      return emk.i;
   }
}
