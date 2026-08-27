import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ctb extends cuj {
   public static final MapCodec<ctb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               afv.a(jz.e).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               afv.a(jz.e).fieldOf("stem").forGetter($$0x -> $$0x.f),
               afv.a(jz.E).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, ctb::new)
   );
   public static final dgv b = cxu.aE;
   protected static final float c = 2.0F;
   private static final Map<hx, eiy> d = Maps.newEnumMap(
      ImmutableMap.of(
         hx.d,
         cua.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         hx.e,
         cua.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         hx.c,
         cua.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         hx.f,
         cua.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final afv<cua> e;
   private final afv<cua> f;
   private final afv<cke> g;

   @Override
   public MapCodec<ctb> a() {
      return a;
   }

   protected ctb(afv<cua> $$0, afv<cua> $$1, afv<cke> $$2, dga.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, hx.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return d.get($$0.c(b));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<cua> $$6 = $$3.H_().d(jz.e).d(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dbu.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.a(cuc.cC);
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return new ckj((cqy)DataFixUtils.orElse($$0.H_().d(jz.E).d(this.g), this));
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }
}
