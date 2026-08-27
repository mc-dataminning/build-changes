import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class csd extends ctl {
   public static final MapCodec<csd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aey.a(jc.e).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               aey.a(jc.e).fieldOf("stem").forGetter($$0x -> $$0x.f),
               aey.a(jc.E).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, csd::new)
   );
   public static final dfx b = cww.aE;
   protected static final float c = 2.0F;
   private static final Map<ha, eia> d = Maps.newEnumMap(
      ImmutableMap.of(
         ha.d,
         ctc.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ha.e,
         ctc.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ha.c,
         ctc.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ha.f,
         ctc.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final aey<ctc> e;
   private final aey<ctc> f;
   private final aey<cjg> g;

   @Override
   public MapCodec<csd> a() {
      return a;
   }

   protected csd(aey<ctc> $$0, aey<ctc> $$1, aey<cjg> $$2, dfc.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ha.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return d.get($$0.c(b));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<ctc> $$6 = $$3.G_().d(jc.e).d(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(daw.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return $$0.a(cte.cC);
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl((cqa)DataFixUtils.orElse($$0.G_().d(jc.E).d(this.g), this));
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }
}
