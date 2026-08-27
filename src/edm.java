import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class edm extends ebe {
   public static final Codec<edm> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dzl.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, edm::new)
   );
   public final dzl e;

   public edm(ebe.c $$0, dzl $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      drn $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      drl $$5 = new drl($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cvz $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      hz.a $$8 = new hz.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dlf $$9 = $$7.a($$6);
         dlf $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(cyq.dW) || $$10.d(cvc.a, $$8.q($$6), ie.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         hz $$11 = new hz($$2, $$6, $$3);
         return Optional.of(new ebe.b($$11, (Consumer<ebw>)($$3x -> edl.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public ebn<?> e() {
      return ebn.i;
   }
}
