import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class etw extends ern {
   public static final MapCodec<etw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), epu.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, etw::new)
   );
   public final epu e;

   public etw(ern.c $$0, epu $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ern.b> a(ern.a $$0) {
      ehr $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      ehp $$5 = new ehp($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      djy $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iv.a $$8 = new iv.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         eat $$9 = $$7.a($$6);
         eat $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dmt.en) || $$10.c(djc.a, $$8.q($$6), jb.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iv $$11 = new iv($$2, $$6, $$3);
         return Optional.of(new ern.b($$11, (Consumer<esf>)($$3x -> etv.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public erw<?> e() {
      return erw.i;
   }
}
