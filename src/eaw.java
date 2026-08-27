import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eaw extends dyo {
   public static final Codec<eaw> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dwv.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eaw::new)
   );
   public final dwv e;

   public eaw(dyo.c $$0, dwv $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dyo.b> a(dyo.a $$0) {
      dox $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dov $$5 = new dov($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      ctk $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      hv.a $$8 = new hv.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dip $$9 = $$7.a($$6);
         dip $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(cwb.dW) || $$10.d(csn.a, $$8.q($$6), ia.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         hv $$11 = new hv($$2, $$6, $$3);
         return Optional.of(new dyo.b($$11, (Consumer<dzg>)($$3x -> eav.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dyx<?> e() {
      return dyx.i;
   }
}
