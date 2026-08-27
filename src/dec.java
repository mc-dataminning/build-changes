import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dec extends dfl {
   public static final MapCodec<dec> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aks.a(li.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               aks.a(li.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               aks.a(li.G).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, dec::new)
   );
   public static final dtw b = djc.aE;
   protected static final float c = 2.0F;
   private static final Map<iw, exn> d = Maps.newEnumMap(
      ImmutableMap.of(
         iw.d,
         dfc.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         iw.e,
         dfc.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         iw.c,
         dfc.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         iw.f,
         dfc.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final aks<dfc> e;
   private final aks<dfc> f;
   private final aks<cuc> g;

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   protected dec(aks<dfc> $$0, aks<dfc> $$1, aks<cuc> $$2, dtb.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, iw.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dfc> $$6 = $$3.I_().d(li.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().n().b(dnm.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.a(dfe.dn) || $$0.a(dfe.do);
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return new cuh((dbz)DataFixUtils.orElse($$0.I_().d(li.G).e(this.g), this));
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }
}
