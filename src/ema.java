import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ema extends ejr {
   public static final MapCodec<ema> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ehx.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ema::new)
   );
   public final ehx e;

   public ema(ejr.c $$0, ehx $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ejr.b> a(ejr.a $$0) {
      dzx $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      dzv $$5 = new dzv($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      ddi $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      jd.a $$8 = new jd.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dtc $$9 = $$7.a($$6);
         dtc $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dga.dW) || $$10.d(dcl.a, $$8.q($$6), ji.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         jd $$11 = new jd($$2, $$6, $$3);
         return Optional.of(new ejr.b($$11, (Consumer<ekj>)($$3x -> elz.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public eka<?> e() {
      return eka.i;
   }
}
