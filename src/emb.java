import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class emb extends ejt {
   public static final Codec<emb> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), ehz.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, emb::new)
   );
   public final ehz e;

   public emb(ejt.d $$0, ehz $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      dzt $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dzr $$5 = new dzr($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dcm $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ir.a $$8 = new ir.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dtc $$9 = $$7.a($$6);
         dtc $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dfe.eK) || $$10.d(dbp.a, $$8.q($$6), iw.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ir $$11 = new ir($$2, $$6, $$3);
         return Optional.of(new ejt.c($$11, (Consumer<ekl>)($$3x -> ema.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public ekc<?> f() {
      return ekc.i;
   }
}
