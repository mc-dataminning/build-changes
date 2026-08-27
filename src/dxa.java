import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class dxa extends duz {
   public static final Codec<dxa> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dtg.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, dxa::new)
   );
   public final dtg e;

   public dxa(duz.c $$0, dtg $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<duz.b> a(duz.a $$0) {
      dli $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dlg $$5 = new dlg($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cpy $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      gu.a $$8 = new gu.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dfa $$9 = $$7.a($$6);
         dfa $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(csn.dX) || $$10.d(cpb.a, $$8.q($$6), ha.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         gu $$11 = new gu($$2, $$6, $$3);
         return Optional.of(new duz.b($$11, (Consumer<dvr>)($$3x -> dwz.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dvi<?> e() {
      return dvi.i;
   }
}
