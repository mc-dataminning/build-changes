import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ebh extends dyz {
   public static final Codec<ebh> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dxg.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ebh::new)
   );
   public final dxg e;

   public ebh(dyz.c $$0, dxg $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dyz.b> a(dyz.a $$0) {
      dpi $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dpg $$5 = new dpg($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      ctu $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      hx.a $$8 = new hx.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dja $$9 = $$7.a($$6);
         dja $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(cwl.dW) || $$10.d(csx.a, $$8.q($$6), ic.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         hx $$11 = new hx($$2, $$6, $$3);
         return Optional.of(new dyz.b($$11, (Consumer<dzr>)($$3x -> ebg.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dzi<?> e() {
      return dzi.i;
   }
}
