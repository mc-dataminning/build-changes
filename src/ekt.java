import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ekt extends eil {
   public static final MapCodec<ekt> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), egs.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ekt::new)
   );
   public final egs e;

   public ekt(eil.c $$0, egs $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eil.b> a(eil.a $$0) {
      dyu $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      dys $$5 = new dys($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dcl $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iz.a $$8 = new iz.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dsd $$9 = $$7.a($$6);
         dsd $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dfc.dW) || $$10.d(dbo.a, $$8.q($$6), je.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iz $$11 = new iz($$2, $$6, $$3);
         return Optional.of(new eil.b($$11, (Consumer<ejd>)($$3x -> eks.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public eiu<?> e() {
      return eiu.i;
   }
}
