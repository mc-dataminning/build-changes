import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ddb extends dej {
   public static final MapCodec<ddb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akm.a(lf.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               akm.a(lf.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               akm.a(lf.G).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, ddb::new)
   );
   public static final drx b = dhw.aE;
   protected static final float c = 2.0F;
   private static final Map<it, evf> d = Maps.newEnumMap(
      ImmutableMap.of(
         it.d,
         dea.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         it.e,
         dea.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         it.c,
         dea.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         it.f,
         dea.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final akm<dea> e;
   private final akm<dea> f;
   private final akm<ctl> g;

   @Override
   public MapCodec<ddb> a() {
      return a;
   }

   protected ddb(akm<dea> $$0, akm<dea> $$1, akm<ctl> $$2, drc.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, it.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dea> $$6 = $$3.H_().d(lf.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().n().b(dlw.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.a(dec.cC);
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return new ctq((day)DataFixUtils.orElse($$0.H_().d(lf.G).e(this.g), this));
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }
}
