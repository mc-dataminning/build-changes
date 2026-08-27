import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class cug extends cvo {
   public static final MapCodec<cug> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               agl.a(kd.e).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               agl.a(kd.e).fieldOf("stem").forGetter($$0x -> $$0x.f),
               agl.a(kd.E).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, cug::new)
   );
   public static final dih b = cza.aE;
   protected static final float c = 2.0F;
   private static final Map<ib, eks> d = Maps.newEnumMap(
      ImmutableMap.of(
         ib.d,
         cvf.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ib.e,
         cvf.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ib.c,
         cvf.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ib.f,
         cvf.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final agl<cvf> e;
   private final agl<cvf> f;
   private final agl<clj> g;

   @Override
   public MapCodec<cug> a() {
      return a;
   }

   protected cug(agl<cvf> $$0, agl<cvf> $$1, agl<clj> $$2, dhm.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ib.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return d.get($$0.c(b));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<cvf> $$6 = $$3.I_().d(kd.e).d(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dda.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.a(cvh.cC);
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo((cse)DataFixUtils.orElse($$0.I_().d(kd.E).d(this.g), this));
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }
}
