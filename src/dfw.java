import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dfw extends dhe {
   public static final MapCodec<dfw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ala.a(lv.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ala.a(lv.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ala.a(lv.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, dfw::new)
   );
   public static final duu b = dkr.aE;
   protected static final float c = 2.0F;
   private static final Map<jj, eyx> d = Maps.newEnumMap(
      ImmutableMap.of(
         jj.d,
         dgv.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jj.e,
         dgv.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jj.c,
         dgv.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jj.f,
         dgv.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ala<dgv> e;
   private final ala<dgv> f;
   private final ala<cvg> g;

   @Override
   public MapCodec<dfw> a() {
      return a;
   }

   protected dfw(ala<dgv> $$0, ala<dgv> $$1, ala<cvg> $$2, dtz.d $$3) {
      super($$3);
      this.l(this.E.b().b(b, jj.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dgv> $$6 = $$3.F_().d(lv.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().c(dos.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return $$0.a(dgx.cC);
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl((ddr)DataFixUtils.orElse($$0.F_().d(lv.K).e(this.g), this));
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }
}
