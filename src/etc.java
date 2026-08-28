import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class etc extends eqt {
   public static final MapCodec<etc> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), epa.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, etc::new)
   );
   public final epa e;

   public etc(eqt.c $$0, epa $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eqt.b> a(eqt.a $$0) {
      egx $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      egv $$5 = new egv($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      djh $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iu.a $$8 = new iu.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dzz $$9 = $$7.a($$6);
         dzz $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dmc.ek) || $$10.c(dil.a, $$8.q($$6), ja.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iu $$11 = new iu($$2, $$6, $$3);
         return Optional.of(new eqt.b($$11, (Consumer<erl>)($$3x -> etb.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public erc<?> e() {
      return erc.i;
   }
}
