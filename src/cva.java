import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class cva extends cwi {
   public static final MapCodec<cva> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ags.a(kc.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ags.a(kc.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ags.a(kc.F).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, cva::new)
   );
   public static final djj b = czu.aE;
   protected static final float c = 2.0F;
   private static final Map<ia, elu> d = Maps.newEnumMap(
      ImmutableMap.of(
         ia.d,
         cvz.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ia.e,
         cvz.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ia.c,
         cvz.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ia.f,
         cvz.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ags<cvz> e;
   private final ags<cvz> f;
   private final ags<cmc> g;

   @Override
   public MapCodec<cva> a() {
      return a;
   }

   protected cva(ags<cvz> $$0, ags<cvz> $$1, ags<cmc> $$2, dio.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ia.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return d.get($$0.c(b));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<cvz> $$6 = $$3.I_().d(kc.f).d(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(ddu.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.a(cwb.cC);
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return new cmh((csx)DataFixUtils.orElse($$0.I_().d(kc.F).d(this.g), this));
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }
}
