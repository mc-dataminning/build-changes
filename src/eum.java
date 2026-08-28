import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eum extends esd {
   public static final MapCodec<eum> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eqk.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eum::new)
   );
   public final eqk e;

   public eum(esd.c $$0, eqk $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<esd.b> a(esd.a $$0) {
      eie $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      eic $$5 = new eic($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dkl $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iw.a $$8 = new iw.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         ebg $$9 = $$7.a($$6);
         ebg $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dng.en) || $$10.c(djp.a, $$8.q($$6), jc.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iw $$11 = new iw($$2, $$6, $$3);
         return Optional.of(new esd.b($$11, (Consumer<esv>)($$3x -> eul.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public esm<?> e() {
      return esm.i;
   }
}
