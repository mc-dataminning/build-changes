import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class dzd extends dwv {
   public static final Codec<dzd> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dvc.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, dzd::new)
   );
   public final dvc e;

   public dzd(dwv.c $$0, dvc $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      dne $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dnc $$5 = new dnc($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cse $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ht.a $$8 = new ht.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dgw $$9 = $$7.a($$6);
         dgw $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(cuv.dW) || $$10.d(crh.a, $$8.q($$6), hx.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ht $$11 = new ht($$2, $$6, $$3);
         return Optional.of(new dwv.b($$11, (Consumer<dxn>)($$3x -> dzc.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dxe<?> e() {
      return dxe.i;
   }
}
