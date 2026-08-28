import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class etk extends erb {
   public static final MapCodec<etk> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), epi.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, etk::new)
   );
   public final epi e;

   public etk(erb.c $$0, epi $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<erb.b> a(erb.a $$0) {
      ehf $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      ehd $$5 = new ehd($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      djm $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iu.a $$8 = new iu.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         eah $$9 = $$7.a($$6);
         eah $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dmh.en) || $$10.c(diq.a, $$8.q($$6), ja.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iu $$11 = new iu($$2, $$6, $$3);
         return Optional.of(new erb.b($$11, (Consumer<ert>)($$3x -> etj.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public erk<?> e() {
      return erk.i;
   }
}
