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

public class dgi {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bqk<dgi.c> a = bqk.c();
   public static final dgi b = new dgi.a().a();
   public static final MapCodec<dgi> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(buy.i, bqk.c(dgi.c.a).promotePartial(ad.a("Spawn data: ", d::error)), baf.a(buy.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lx.f.q(), dgi.b.a, lx.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dgi::new)
   );
   private final float f;
   private final Map<buy, bqk<dgi.c>> g;
   private final Map<bug<?>, dgi.b> h;

   dgi(float $$0, Map<buy, bqk<dgi.c>> $$1, Map<bug<?>, dgi.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bqk<dgi.c> a(buy $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dgi.b a(bug<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<buy, List<dgi.c>> a = Stream.of(buy.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bug<?>, dgi.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dgi.a a(buy $$0, dgi.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dgi.a a(bug<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dgi.b($$2, $$1));
         return this;
      }

      public dgi.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dgi a() {
         return new dgi(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bqk.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dgi.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dgi.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bqi.a {
      public static final Codec<dgi.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lx.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bqh.a.fieldOf("weight").forGetter(bqi.a::a),
                     ays.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ays.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dgi.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bug<?> b;
      public final int c;
      public final int d;

      public c(bug<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bqh.a($$1), $$2, $$3);
      }

      public c(bug<?> $$0, bqh $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == buy.h ? bug.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bug.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
