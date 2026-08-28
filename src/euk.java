import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class euk extends esb {
   public static final MapCodec<euk> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eqi.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, euk::new)
   );
   public final eqi e;

   public euk(esb.c $$0, eqi $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      eic $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      eia $$5 = new eia($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dkj $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iv.a $$8 = new iv.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         ebe $$9 = $$7.a($$6);
         ebe $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dne.en) || $$10.c(djn.a, $$8.q($$6), jb.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iv $$11 = new iv($$2, $$6, $$3);
         return Optional.of(new esb.b($$11, (Consumer<est>)($$3x -> euj.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public esk<?> e() {
      return esk.i;
   }
}
