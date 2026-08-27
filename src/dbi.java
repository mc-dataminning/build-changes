import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dbi extends dcq {
   public static final MapCodec<dbi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aju.a(ku.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               aju.a(ku.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               aju.a(ku.G).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, dbi::new)
   );
   public static final dqc b = dgc.aE;
   protected static final float c = 2.0F;
   private static final Map<ij, etc> d = Maps.newEnumMap(
      ImmutableMap.of(
         ij.d,
         dch.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ij.e,
         dch.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ij.c,
         dch.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ij.f,
         dch.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final aju<dch> e;
   private final aju<dch> f;
   private final aju<crn> g;

   @Override
   public MapCodec<dbi> a() {
      return a;
   }

   protected dbi(aju<dch> $$0, aju<dch> $$1, aju<crn> $$2, dph.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ij.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dch> $$6 = $$3.H_().d(ku.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().n().b(dkc.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return $$0.a(dcj.cC);
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return new crs((czf)DataFixUtils.orElse($$0.H_().d(ku.G).e(this.g), this));
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }
}
