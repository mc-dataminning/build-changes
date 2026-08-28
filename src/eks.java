import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eks extends eik {
   public static final MapCodec<eks> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), egr.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eks::new)
   );
   public final egr e;

   public eks(eik.c $$0, egr $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eik.b> a(eik.a $$0) {
      dyt $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      dyr $$5 = new dyr($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dck $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iz.a $$8 = new iz.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dsc $$9 = $$7.a($$6);
         dsc $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dfb.dW) || $$10.d(dbn.a, $$8.q($$6), je.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iz $$11 = new iz($$2, $$6, $$3);
         return Optional.of(new eik.b($$11, (Consumer<ejc>)($$3x -> ekr.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public eit<?> e() {
      return eit.i;
   }
}
