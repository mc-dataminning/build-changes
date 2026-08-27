import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class cyg extends czo {
   public static final MapCodec<cyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ajb.a(ki.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ajb.a(ki.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ajb.a(ki.F).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, cyg::new)
   );
   public static final dmy b = dda.aE;
   protected static final float c = 2.0F;
   private static final Map<ih, epo> d = Maps.newEnumMap(
      ImmutableMap.of(
         ih.d,
         czf.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ih.e,
         czf.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ih.c,
         czf.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ih.f,
         czf.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ajb<czf> e;
   private final ajb<czf> f;
   private final ajb<cpl> g;

   @Override
   public MapCodec<cyg> a() {
      return a;
   }

   protected cyg(ajb<czf> $$0, ajb<czf> $$1, ajb<cpl> $$2, dmd.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ih.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<czf> $$6 = $$3.I_().d(ki.f).d(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dha.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.a(czh.cC);
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return new cpq((cwd)DataFixUtils.orElse($$0.I_().d(ki.F).d(this.g), this));
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }
}
