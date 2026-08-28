import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eor extends emi {
   public static final MapCodec<eor> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ekp.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eor::new)
   );
   public final ekp e;

   public eor(emi.c $$0, ekp $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<emi.b> a(emi.a $$0) {
      ecp $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      ecn $$5 = new ecn($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dfy $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      jh.a $$8 = new jh.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dvv $$9 = $$7.a($$6);
         dvv $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dis.dW) || $$10.c(dfb.a, $$8.q($$6), jm.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         jh $$11 = new jh($$2, $$6, $$3);
         return Optional.of(new emi.b($$11, (Consumer<ena>)($$3x -> eoq.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public emr<?> e() {
      return emr.i;
   }
}
