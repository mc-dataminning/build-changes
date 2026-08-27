import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class dzp extends dxh {
   public static final Codec<dzp> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dvo.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, dzp::new)
   );
   public final dvo e;

   public dzp(dxh.c $$0, dvo $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dxh.b> a(dxh.a $$0) {
      dnq $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dno $$5 = new dno($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      csm $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ht.a $$8 = new ht.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dhi $$9 = $$7.a($$6);
         dhi $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(cvc.dW) || $$10.d(crp.a, $$8.q($$6), hx.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ht $$11 = new ht($$2, $$6, $$3);
         return Optional.of(new dxh.b($$11, (Consumer<dxz>)($$3x -> dzo.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dxq<?> e() {
      return dxq.i;
   }
}
