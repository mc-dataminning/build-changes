import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class dwz extends duy {
   public static final Codec<dwz> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dtf.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, dwz::new)
   );
   public final dtf e;

   public dwz(duy.c $$0, dtf $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<duy.b> a(duy.a $$0) {
      dlh $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dlf $$5 = new dlf($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cpx $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      gu.a $$8 = new gu.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dez $$9 = $$7.a($$6);
         dez $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(csm.dX) || $$10.d(cpa.a, $$8.q($$6), ha.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         gu $$11 = new gu($$2, $$6, $$3);
         return Optional.of(new duy.b($$11, (Consumer<dvq>)($$3x -> dwy.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dvh<?> e() {
      return dvh.i;
   }
}
