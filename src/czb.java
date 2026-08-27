import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class czb extends daj {
   public static final MapCodec<czb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ajg.a(kj.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ajg.a(kj.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ajg.a(kj.F).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, czb::new)
   );
   public static final dnt b = ddv.aE;
   protected static final float c = 2.0F;
   private static final Map<ih, eqk> d = Maps.newEnumMap(
      ImmutableMap.of(
         ih.d,
         daa.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ih.e,
         daa.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ih.c,
         daa.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ih.f,
         daa.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ajg<daa> e;
   private final ajg<daa> f;
   private final ajg<cqf> g;

   @Override
   public MapCodec<czb> a() {
      return a;
   }

   protected czb(ajg<daa> $$0, ajg<daa> $$1, ajg<cqf> $$2, dmy.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ih.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<daa> $$6 = $$3.H_().d(kj.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dhv.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.a(dac.cC);
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return new cqk((cwy)DataFixUtils.orElse($$0.H_().d(kj.F).e(this.g), this));
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }
}
