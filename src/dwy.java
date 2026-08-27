import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class dwy extends dux {
   public static final Codec<dwy> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dte.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, dwy::new)
   );
   public final dte e;

   public dwy(dux.c $$0, dte $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dux.b> a(dux.a $$0) {
      dlg $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dle $$5 = new dle($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cpw $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      gv.a $$8 = new gv.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dey $$9 = $$7.a($$6);
         dey $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(csl.dX) || $$10.d(coz.a, $$8.q($$6), hb.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         gv $$11 = new gv($$2, $$6, $$3);
         return Optional.of(new dux.b($$11, (Consumer<dvp>)($$3x -> dwx.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dvg<?> e() {
      return dvg.i;
   }
}
