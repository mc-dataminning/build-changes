import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class dzu extends dxm {
   public static final Codec<dzu> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dvt.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, dzu::new)
   );
   public final dvt e;

   public dzu(dxm.c $$0, dvt $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      dnv $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dnt $$5 = new dnt($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      csr $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      hx.a $$8 = new hx.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dhn $$9 = $$7.a($$6);
         dhn $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(cvh.dW) || $$10.d(cru.a, $$8.q($$6), ib.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         hx $$11 = new hx($$2, $$6, $$3);
         return Optional.of(new dxm.b($$11, (Consumer<dye>)($$3x -> dzt.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dxv<?> e() {
      return dxv.i;
   }
}
