import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dea extends dfi {
   public static final MapCodec<dea> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ale.a(lq.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ale.a(lq.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ale.a(lq.G).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, dea::new)
   );
   public static final dsw b = div.aE;
   protected static final float c = 2.0F;
   private static final Map<je, ewk> d = Maps.newEnumMap(
      ImmutableMap.of(
         je.d,
         dez.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         je.e,
         dez.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         je.c,
         dez.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         je.f,
         dez.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ale<dez> e;
   private final ale<dez> f;
   private final ale<cuk> g;

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   protected dea(ale<dez> $$0, ale<dez> $$1, ale<cuk> $$2, dsb.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, je.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dez> $$6 = $$3.H_().d(lq.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dmv.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.a(dfb.cC);
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup((dbx)DataFixUtils.orElse($$0.H_().d(lq.G).e(this.g), this));
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }
}
