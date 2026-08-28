import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class epw extends enn {
   public static final MapCodec<epw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), elu.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, epw::new)
   );
   public final elu e;

   public epw(enn.c $$0, elu $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<enn.b> a(enn.a $$0) {
      eds $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      edq $$5 = new edq($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dgv $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ji.a $$8 = new ji.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dwy $$9 = $$7.a($$6);
         dwy $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(djp.ej) || $$10.c(dfy.a, $$8.q($$6), jn.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ji $$11 = new ji($$2, $$6, $$3);
         return Optional.of(new enn.b($$11, (Consumer<eof>)($$3x -> epv.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public enw<?> e() {
      return enw.i;
   }
}
