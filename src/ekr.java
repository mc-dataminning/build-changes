import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ekr extends eij {
   public static final MapCodec<ekr> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), egq.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ekr::new)
   );
   public final egq e;

   public ekr(eij.c $$0, egq $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      dys $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      dyq $$5 = new dyq($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dcj $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iz.a $$8 = new iz.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dsb $$9 = $$7.a($$6);
         dsb $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dfa.dW) || $$10.d(dbm.a, $$8.q($$6), je.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iz $$11 = new iz($$2, $$6, $$3);
         return Optional.of(new eij.b($$11, (Consumer<ejb>)($$3x -> ekq.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public eis<?> e() {
      return eis.i;
   }
}
