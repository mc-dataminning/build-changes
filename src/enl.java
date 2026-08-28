import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class enl extends elc {
   public static final MapCodec<enl> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ejj.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, enl::new)
   );
   public final ejj e;

   public enl(elc.c $$0, ejj $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      ebj $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      ebh $$5 = new ebh($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      des $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      je.a $$8 = new je.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         duo $$9 = $$7.a($$6);
         duo $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dhl.dW) || $$10.c(ddv.a, $$8.q($$6), jj.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         je $$11 = new je($$2, $$6, $$3);
         return Optional.of(new elc.b($$11, (Consumer<elu>)($$3x -> enk.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public ell<?> e() {
      return ell.i;
   }
}
