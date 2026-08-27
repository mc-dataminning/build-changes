import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ebo extends dzg {
   public static final Codec<ebo> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dxn.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ebo::new)
   );
   public final dxn e;

   public ebo(dzg.c $$0, dxn $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dzg.b> a(dzg.a $$0) {
      dpp $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dpn $$5 = new dpn($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cub $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      hx.a $$8 = new hx.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         djh $$9 = $$7.a($$6);
         djh $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(cws.dW) || $$10.d(cte.a, $$8.q($$6), ic.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         hx $$11 = new hx($$2, $$6, $$3);
         return Optional.of(new dzg.b($$11, (Consumer<dzy>)($$3x -> ebn.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dzp<?> e() {
      return dzp.i;
   }
}
