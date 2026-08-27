import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class cvk extends cws {
   public static final MapCodec<cvk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ahc.a(ke.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ahc.a(ke.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ahc.a(ke.F).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, cvk::new)
   );
   public static final dju b = dae.aE;
   protected static final float c = 2.0F;
   private static final Map<ic, emf> d = Maps.newEnumMap(
      ImmutableMap.of(
         ic.d,
         cwj.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ic.e,
         cwj.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ic.c,
         cwj.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ic.f,
         cwj.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ahc<cwj> e;
   private final ahc<cwj> f;
   private final ahc<cmm> g;

   @Override
   public MapCodec<cvk> a() {
      return a;
   }

   protected cvk(ahc<cwj> $$0, ahc<cwj> $$1, ahc<cmm> $$2, diz.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ic.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return d.get($$0.c(b));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<cwj> $$6 = $$3.I_().d(ke.f).d(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dee.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.a(cwl.cC);
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return new cmr((cth)DataFixUtils.orElse($$0.I_().d(ke.F).d(this.g), this));
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }
}
