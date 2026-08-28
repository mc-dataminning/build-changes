import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dgk extends dhs {
   public static final MapCodec<dgk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alb.a(lv.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               alb.a(lv.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               alb.a(lv.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, dgk::new)
   );
   public static final dvi b = dlf.aF;
   protected static final float c = 2.0F;
   private static final Map<jj, ezm> d = Maps.newEnumMap(
      ImmutableMap.of(
         jj.d,
         dhj.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jj.e,
         dhj.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jj.c,
         dhj.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jj.f,
         dhj.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final alb<dhj> e;
   private final alb<dhj> f;
   private final alb<cvk> g;

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   protected dgk(alb<dhj> $$0, alb<dhj> $$1, alb<cvk> $$2, dun.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jj.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dhj> $$6 = $$3.F_().d(lv.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().c(dpg.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.a(dhl.cC);
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return new cvp((def)DataFixUtils.orElse($$0.F_().d(lv.K).e(this.g), this));
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }
}
