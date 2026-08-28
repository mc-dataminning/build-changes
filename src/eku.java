import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eku extends eim {
   public static final MapCodec<eku> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), egt.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eku::new)
   );
   public final egt e;

   public eku(eim.c $$0, egt $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eim.b> a(eim.a $$0) {
      dyv $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      dyt $$5 = new dyt($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dcm $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iz.a $$8 = new iz.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dse $$9 = $$7.a($$6);
         dse $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dfd.dW) || $$10.d(dbp.a, $$8.q($$6), je.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iz $$11 = new iz($$2, $$6, $$3);
         return Optional.of(new eim.b($$11, (Consumer<eje>)($$3x -> ekt.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public eiv<?> e() {
      return eiv.i;
   }
}
