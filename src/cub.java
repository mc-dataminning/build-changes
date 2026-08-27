import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class cub extends cvj {
   public static final MapCodec<cub> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               agh.a(jz.e).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               agh.a(jz.e).fieldOf("stem").forGetter($$0x -> $$0x.f),
               agh.a(jz.E).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, cub::new)
   );
   public static final dic b = cyv.aE;
   protected static final float c = 2.0F;
   private static final Map<hx, ekn> d = Maps.newEnumMap(
      ImmutableMap.of(
         hx.d,
         cva.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         hx.e,
         cva.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         hx.c,
         cva.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         hx.f,
         cva.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final agh<cva> e;
   private final agh<cva> f;
   private final agh<cle> g;

   @Override
   public MapCodec<cub> a() {
      return a;
   }

   protected cub(agh<cva> $$0, agh<cva> $$1, agh<cle> $$2, dhh.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, hx.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return d.get($$0.c(b));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<cva> $$6 = $$3.H_().d(jz.e).d(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dcv.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.a(cvc.cC);
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return new clj((crz)DataFixUtils.orElse($$0.H_().d(jz.E).d(this.g), this));
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }
}
