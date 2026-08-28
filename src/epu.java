import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class epu extends enl {
   public static final MapCodec<epu> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), els.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, epu::new)
   );
   public final els e;

   public epu(enl.c $$0, els $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<enl.b> a(enl.a $$0) {
      edq $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      edo $$5 = new edo($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dgt $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ji.a $$8 = new ji.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dww $$9 = $$7.a($$6);
         dww $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(djn.ej) || $$10.c(dfw.a, $$8.q($$6), jn.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ji $$11 = new ji($$2, $$6, $$3);
         return Optional.of(new enl.b($$11, (Consumer<eod>)($$3x -> ept.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public enu<?> e() {
      return enu.i;
   }
}
