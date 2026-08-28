import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ekn extends eif {
   public static final MapCodec<ekn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), egm.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ekn::new)
   );
   public final egm e;

   public ekn(eif.c $$0, egm $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eif.b> a(eif.a $$0) {
      dyo $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dym $$5 = new dym($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dcf $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iz.a $$8 = new iz.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         drx $$9 = $$7.a($$6);
         drx $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dew.dW) || $$10.d(dbi.a, $$8.q($$6), je.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iz $$11 = new iz($$2, $$6, $$3);
         return Optional.of(new eif.b($$11, (Consumer<eix>)($$3x -> ekm.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public eio<?> e() {
      return eio.i;
   }
}
