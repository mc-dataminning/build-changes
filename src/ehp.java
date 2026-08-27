import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ehp extends efh {
   public static final Codec<ehp> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), edo.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ehp::new)
   );
   public final edo e;

   public ehp(efh.c $$0, edo $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<efh.b> a(efh.a $$0) {
      dvq $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dvo $$5 = new dvo($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      czj $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ib.a $$8 = new ib.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         doz $$9 = $$7.a($$6);
         doz $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dca.dW) || $$10.d(cym.a, $$8.q($$6), ih.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ib $$11 = new ib($$2, $$6, $$3);
         return Optional.of(new efh.b($$11, (Consumer<efz>)($$3x -> eho.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public efq<?> e() {
      return efq.i;
   }
}
