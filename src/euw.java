import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class euw extends esn {
   public static final MapCodec<euw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), equ.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, euw::new)
   );
   public final equ e;

   public euw(esn.c $$0, equ $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<esn.b> a(esn.a $$0) {
      eio $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      eim $$5 = new eim($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dkv $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iw.a $$8 = new iw.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         ebq $$9 = $$7.a($$6);
         ebq $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dnq.en) || $$10.c(djz.a, $$8.q($$6), jc.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iw $$11 = new iw($$2, $$6, $$3);
         return Optional.of(new esn.b($$11, (Consumer<etf>)($$3x -> euv.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public esw<?> e() {
      return esw.i;
   }
}
