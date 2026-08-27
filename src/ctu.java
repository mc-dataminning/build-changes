import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ctu extends cvc {
   public static final MapCodec<ctu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               agf.a(jz.e).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               agf.a(jz.e).fieldOf("stem").forGetter($$0x -> $$0x.f),
               agf.a(jz.E).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, ctu::new)
   );
   public static final dhq b = cyo.aE;
   protected static final float c = 2.0F;
   private static final Map<hx, ekb> d = Maps.newEnumMap(
      ImmutableMap.of(
         hx.d,
         cut.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         hx.e,
         cut.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         hx.c,
         cut.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         hx.f,
         cut.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final agf<cut> e;
   private final agf<cut> f;
   private final agf<ckw> g;

   @Override
   public MapCodec<ctu> a() {
      return a;
   }

   protected ctu(agf<cut> $$0, agf<cut> $$1, agf<ckw> $$2, dgv.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, hx.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return d.get($$0.c(b));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<cut> $$6 = $$3.H_().d(jz.e).d(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dco.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.a(cuv.cC);
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return new clb((crr)DataFixUtils.orElse($$0.H_().d(jz.E).d(this.g), this));
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }
}
