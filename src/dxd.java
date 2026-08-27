import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class dxd extends dvc {
   public static final Codec<dxd> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dtj.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, dxd::new)
   );
   public final dtj e;

   public dxd(dvc.c $$0, dtj $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dvc.b> a(dvc.a $$0) {
      dll $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dlj $$5 = new dlj($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cqn $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      gw.a $$8 = new gw.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dfd $$9 = $$7.a($$6);
         dfd $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(cte.dW) || $$10.d(cpq.a, $$8.q($$6), ha.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         gw $$11 = new gw($$2, $$6, $$3);
         return Optional.of(new dvc.b($$11, (Consumer<dvu>)($$3x -> dxc.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dvl<?> e() {
      return dvl.i;
   }
}
