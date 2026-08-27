import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dcf extends ddn {
   public static final MapCodec<dcf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akg.a(le.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               akg.a(le.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               akg.a(le.G).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, dcf::new)
   );
   public static final drb b = dha.aE;
   protected static final float c = 2.0F;
   private static final Map<is, eui> d = Maps.newEnumMap(
      ImmutableMap.of(
         is.d,
         dde.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         is.e,
         dde.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         is.c,
         dde.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         is.f,
         dde.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final akg<dde> e;
   private final akg<dde> f;
   private final akg<csu> g;

   @Override
   public MapCodec<dcf> a() {
      return a;
   }

   protected dcf(akg<dde> $$0, akg<dde> $$1, akg<csu> $$2, dqg.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, is.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dde> $$6 = $$3.H_().d(le.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().n().b(dla.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.a(ddg.cC);
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz((dac)DataFixUtils.orElse($$0.H_().d(le.G).e(this.g), this));
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }
}
