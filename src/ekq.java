import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ekq extends eii {
   public static final MapCodec<ekq> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), egp.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ekq::new)
   );
   public final egp e;

   public ekq(eii.c $$0, egp $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eii.b> a(eii.a $$0) {
      dyr $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      dyp $$5 = new dyp($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dci $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iz.a $$8 = new iz.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dsa $$9 = $$7.a($$6);
         dsa $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dez.dW) || $$10.d(dbl.a, $$8.q($$6), je.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iz $$11 = new iz($$2, $$6, $$3);
         return Optional.of(new eii.b($$11, (Consumer<eja>)($$3x -> ekp.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public eir<?> e() {
      return eir.i;
   }
}
