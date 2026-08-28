import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dde {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bpd<dde.c> a = bpd.c();
   public static final dde b = new dde.a().a();
   public static final MapCodec<dde> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(btn.i, bpd.c(dde.c.a).promotePartial(ac.a("Spawn data: ", d::error)), azp.a(btn.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lp.g.q(), dde.b.a, lp.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dde::new)
   );
   private final float f;
   private final Map<btn, bpd<dde.c>> g;
   private final Map<bsv<?>, dde.b> h;

   dde(float $$0, Map<btn, bpd<dde.c>> $$1, Map<bsv<?>, dde.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bpd<dde.c> a(btn $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dde.b a(bsv<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<btn, List<dde.c>> a = Stream.of(btn.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bsv<?>, dde.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dde.a a(btn $$0, dde.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dde.a a(bsv<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dde.b($$2, $$1));
         return this;
      }

      public dde.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dde a() {
         return new dde(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bpd.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dde.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dde.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bpb.a {
      public static final Codec<dde.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lp.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bpa.a.fieldOf("weight").forGetter(bpb.a::a),
                     ayc.l.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayc.l.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dde.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bsv<?> b;
      public final int c;
      public final int d;

      public c(bsv<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bpa.a($$1), $$2, $$3);
      }

      public c(bsv<?> $$0, bpa $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == btn.h ? bsv.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bsv.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
