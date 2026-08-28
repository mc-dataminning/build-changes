import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eky extends eiq {
   public static final MapCodec<eky> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), egx.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eky::new)
   );
   public final egx e;

   public eky(eiq.c $$0, egx $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eiq.b> a(eiq.a $$0) {
      dyy $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      dyw $$5 = new dyw($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dcp $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ja.a $$8 = new ja.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dsh $$9 = $$7.a($$6);
         dsh $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dfh.dW) || $$10.d(dbs.a, $$8.q($$6), jf.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ja $$11 = new ja($$2, $$6, $$3);
         return Optional.of(new eiq.b($$11, (Consumer<eji>)($$3x -> ekx.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public eiz<?> e() {
      return eiz.i;
   }
}
