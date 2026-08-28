import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dhf extends din {
   public static final MapCodec<dhf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alh.a(lz.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               alh.a(lz.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               alh.a(lz.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dhf::new)
   );
   public static final dwd b = dlz.aF;
   protected static final float c = 2.0F;
   private static final Map<jm, fah> d = Maps.newEnumMap(
      ImmutableMap.of(
         jm.d,
         die.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jm.e,
         die.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jm.c,
         die.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jm.f,
         die.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final alh<die> e;
   private final alh<die> f;
   private final alh<cvx> g;

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   protected dhf(alh<die> $$0, alh<die> $$1, alh<cvx> $$2, dvi.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jm.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<die> $$6 = $$3.H_().e(lz.f).f(this.f);
         if ($$6.isPresent()) {
            return $$6.get().m().c(dqa.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return $$0.a(dig.cC);
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return new cwb((dfa)DataFixUtils.orElse($$0.H_().e(lz.K).f(this.g), this));
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }
}
