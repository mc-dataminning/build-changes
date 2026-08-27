import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class cxp extends cyx {
   public static final MapCodec<cxp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aix.a(kg.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               aix.a(kg.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               aix.a(kg.F).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, cxp::new)
   );
   public static final dlz b = dcj.aE;
   protected static final float c = 2.0F;
   private static final Map<ie, eol> d = Maps.newEnumMap(
      ImmutableMap.of(
         ie.d,
         cyo.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ie.e,
         cyo.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ie.c,
         cyo.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ie.f,
         cyo.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final aix<cyo> e;
   private final aix<cyo> f;
   private final aix<cou> g;

   @Override
   public MapCodec<cxp> a() {
      return a;
   }

   protected cxp(aix<cyo> $$0, aix<cyo> $$1, aix<cou> $$2, dle.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ie.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<cyo> $$6 = $$3.I_().d(kg.f).d(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dgj.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return $$0.a(cyq.cC);
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return new coz((cvm)DataFixUtils.orElse($$0.I_().d(kg.F).d(this.g), this));
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }
}
