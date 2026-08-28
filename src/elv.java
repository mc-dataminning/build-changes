import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class elv extends ejm {
   public static final MapCodec<elv> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eht.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, elv::new)
   );
   public final eht e;

   public elv(ejm.c $$0, eht $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ejm.b> a(ejm.a $$0) {
      dzu $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      dzs $$5 = new dzs($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      ddg $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      jd.a $$8 = new jd.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dta $$9 = $$7.a($$6);
         dta $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dfy.dW) || $$10.d(dcj.a, $$8.q($$6), ji.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         jd $$11 = new jd($$2, $$6, $$3);
         return Optional.of(new ejm.b($$11, (Consumer<eke>)($$3x -> elu.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public ejv<?> e() {
      return ejv.i;
   }
}
