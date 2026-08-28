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

public class ddh {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bpg<ddh.c> a = bpg.c();
   public static final ddh b = new ddh.a().a();
   public static final MapCodec<ddh> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(btq.i, bpg.c(ddh.c.a).promotePartial(ac.a("Spawn data: ", d::error)), azs.a(btq.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lp.g.q(), ddh.b.a, lp.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ddh::new)
   );
   private final float f;
   private final Map<btq, bpg<ddh.c>> g;
   private final Map<bsy<?>, ddh.b> h;

   ddh(float $$0, Map<btq, bpg<ddh.c>> $$1, Map<bsy<?>, ddh.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bpg<ddh.c> a(btq $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public ddh.b a(bsy<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<btq, List<ddh.c>> a = Stream.of(btq.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bsy<?>, ddh.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public ddh.a a(btq $$0, ddh.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public ddh.a a(bsy<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new ddh.b($$2, $$1));
         return this;
      }

      public ddh.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public ddh a() {
         return new ddh(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bpg.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<ddh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, ddh.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bpe.a {
      public static final Codec<ddh.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lp.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bpd.a.fieldOf("weight").forGetter(bpe.a::a),
                     ayf.l.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayf.l.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, ddh.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bsy<?> b;
      public final int c;
      public final int d;

      public c(bsy<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bpd.a($$1), $$2, $$3);
      }

      public c(bsy<?> $$0, bpd $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == btq.h ? bsy.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bsy.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
