import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eql extends eoc {
   public static final MapCodec<eql> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), emj.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eql::new)
   );
   public final emj e;

   public eql(eoc.c $$0, emj $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eoc.b> a(eoc.a $$0) {
      eeh $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      eef $$5 = new eef($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dhm $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      jh.a $$8 = new jh.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dxn $$9 = $$7.a($$6);
         dxn $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dkg.ej) || $$10.c(dgp.a, $$8.q($$6), jm.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         jh $$11 = new jh($$2, $$6, $$3);
         return Optional.of(new eoc.b($$11, (Consumer<eou>)($$3x -> eqk.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public eol<?> e() {
      return eol.i;
   }
}
