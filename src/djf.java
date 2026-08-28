import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class djf extends dko {
   public static final MapCodec<djf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aly.a(mb.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               aly.a(mb.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               aly.a(mb.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, djf::new)
   );
   public static final dyk<jm> b = doc.aF;
   protected static final float c = 2.0F;
   private static final Map<jm, fcm> d = Maps.newEnumMap(
      ImmutableMap.of(
         jm.d,
         dke.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jm.e,
         dke.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jm.c,
         dke.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jm.f,
         dke.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final aly<dke> e;
   private final aly<dke> f;
   private final aly<cxg> g;

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   protected djf(aly<dke> $$0, aly<dke> $$1, aly<cxg> $$2, dxm.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jm.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if (!$$6.a(this.e) && $$4 == $$0.c(b)) {
         Optional<dke> $$8 = $$1.K_().e(mb.f).f(this.f);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dsd.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.a(dkg.cK);
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return new cxk((dgz)DataFixUtils.orElse($$0.K_().e(mb.K).f(this.g), this));
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }
}
