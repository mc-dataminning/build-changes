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

public class dhu {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bqu<dhu.c> a = bqu.c();
   public static final dhu b = new dhu.a().a();
   public static final MapCodec<dhu> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bvi.i, bqu.c(dhu.c.a).promotePartial(af.a("Spawn data: ", d::error)), azu.a(bvi.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(mb.f.q(), dhu.b.a, mb.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dhu::new)
   );
   private final float f;
   private final Map<bvi, bqu<dhu.c>> g;
   private final Map<buq<?>, dhu.b> h;

   dhu(float $$0, Map<bvi, bqu<dhu.c>> $$1, Map<buq<?>, dhu.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bqu<dhu.c> a(bvi $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dhu.b a(buq<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bvi, List<dhu.c>> a = Stream.of(bvi.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<buq<?>, dhu.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dhu.a a(bvi $$0, dhu.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dhu.a a(buq<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dhu.b($$2, $$1));
         return this;
      }

      public dhu.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dhu a() {
         return new dhu(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bqu.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dhu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dhu.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bqs.a {
      public static final Codec<dhu.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     mb.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bqr.a.fieldOf("weight").forGetter(bqs.a::a),
                     ayh.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayh.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dhu.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final buq<?> b;
      public final int c;
      public final int d;

      public c(buq<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bqr.a($$1), $$2, $$3);
      }

      public c(buq<?> $$0, bqr $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bvi.h ? buq.aQ : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return buq.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
