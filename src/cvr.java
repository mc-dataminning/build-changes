import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class cvr extends cwz {
   public static final MapCodec<cvr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ahf.a(ke.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ahf.a(ke.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ahf.a(ke.F).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, cvr::new)
   );
   public static final dkb b = dal.aE;
   protected static final float c = 2.0F;
   private static final Map<ic, emm> d = Maps.newEnumMap(
      ImmutableMap.of(
         ic.d,
         cwq.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ic.e,
         cwq.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ic.c,
         cwq.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ic.f,
         cwq.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ahf<cwq> e;
   private final ahf<cwq> f;
   private final ahf<cmt> g;

   @Override
   public MapCodec<cvr> a() {
      return a;
   }

   protected cvr(ahf<cwq> $$0, ahf<cwq> $$1, ahf<cmt> $$2, djg.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ic.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return d.get($$0.c(b));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<cwq> $$6 = $$3.I_().d(ke.f).d(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(del.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return $$0.a(cws.cC);
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return new cmy((cto)DataFixUtils.orElse($$0.I_().d(ke.F).d(this.g), this));
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }
}
