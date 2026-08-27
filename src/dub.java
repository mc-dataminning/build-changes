import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class dub extends dsa {
   public static final Codec<dub> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dqh.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, dub::new)
   );
   public final dqh e;

   public dub(dsa.c $$0, dqh $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dsa.b> a(dsa.a $$0) {
      dij $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dih $$5 = new dih($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cmy $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      gu.a $$8 = new gu.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dcb $$9 = $$7.a($$6);
         dcb $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(cpo.dX) || $$10.d(cmb.a, $$8.q($$6), ha.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         gu $$11 = new gu($$2, $$6, $$3);
         return Optional.of(new dsa.b($$11, (Consumer<dss>)($$3x -> dua.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dsj<?> e() {
      return dsj.i;
   }
}
