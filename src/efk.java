import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class efk extends edc {
   public static final Codec<efk> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), ebj.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, efk::new)
   );
   public final ebj e;

   public efk(edc.c $$0, ebj $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<edc.b> a(edc.a $$0) {
      dtl $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dtj $$5 = new dtj($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cxl $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ib.a $$8 = new ib.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dmz $$9 = $$7.a($$6);
         dmz $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dac.dW) || $$10.d(cwo.a, $$8.q($$6), ih.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ib $$11 = new ib($$2, $$6, $$3);
         return Optional.of(new edc.b($$11, (Consumer<edu>)($$3x -> efj.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public edl<?> e() {
      return edl.i;
   }
}
